package com.version.first.controller;

import com.alibaba.fastjson.JSON;
import com.version.first.Result.ResponseWrapper;
import com.version.first.bean.Menu;
import com.version.first.service.MenuService;
import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class FileUploadController {
    @Resource
    MenuService menuService;
    /**
     * 图片上传
     * @param myfiles
     * @param request
     * @param menu
     * @return
     */
    @RequestMapping("/upload")
    public ResponseWrapper uploadApk(MultipartFile myfiles, HttpServletRequest request, Menu menu) {
        Map<String, Object> resMap = new HashMap<String, Object>();
        if (myfiles.getSize() > 1024 * 1024 * 5) {
            resMap.put("code", 500);
            resMap.put("msg", "文件过大，请上传5M以内的图片");
            System.out.println("文件上传失败");
            return ResponseWrapper.markSuccess(resMap);
        }
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
        Date dt = new Date();
        Long time = dt.getTime();
        if (myfiles != null) {
            String realPath = "E://uploadFiles/";  // 获取保存的路径，本地磁盘中的一个文件夹
            if (myfiles.isEmpty()) {// 未选择文件
                resMap.put("code", 400);
                resMap.put("msg", "未选择文件");
            } else {
                // 文件原名称
                String originFileName = "";
                // 上传文件重命名
                String originalFilename = time.toString().substring(time.toString().length() - 8, time.toString().length());
                originalFilename = originalFilename.concat(".");
                originalFilename = originalFilename.concat(myfiles.getOriginalFilename().toString().substring(myfiles.getOriginalFilename().toString().indexOf(".") + 1));
                try {
                    // 这里使用Apache的FileUtils方法来进行保存
                    FileUtils.copyInputStreamToFile(myfiles.getInputStream(), new File(realPath, originalFilename));
                    resMap.put("code", 200);
                    resMap.put("msg", "上传成功");
                    resMap.put("filename", originalFilename);
                    resMap.put("path", basePath + "/static/image/" + originalFilename);

                    //保存数据库
                    menu.setMenuPicture(basePath + "/static/image/" + originalFilename);
                    menuService.addMenuPictureByMenuId(menu);

                } catch (IOException e) {
                    resMap.put("code", 500);
                    System.out.println("文件上传失败");
                    resMap.put("msg", "文件上传失败");
                    e.printStackTrace();
                }
            }
        }
        String param = JSON.toJSONString(resMap);
        System.out.println(param);
        return ResponseWrapper.markSuccess(resMap);
    }
}
