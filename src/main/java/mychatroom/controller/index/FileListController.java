package mychatroom.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 功能：
 * 日期：2024/5/20 下午4:26
 */
@Controller
public class FileListController {

    @GetMapping("/fileList")
    public String fileList(Model model){
        // 读取文件列表file下的文件传给前端页面fileList
        File folder = new File("file");
        File[] listOfFiles = folder.listFiles();
        List<String> fileNames = new ArrayList<>();

        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    fileNames.add(file.getName());
                }
            }
        }

        model.addAttribute("files", fileNames);
        return "fileList";
    }

}