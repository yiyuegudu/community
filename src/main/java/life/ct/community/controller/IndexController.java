package life.ct.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Copyright: Unicom (Zhejiang) Industrial Internet Co., Ltd.    2020 <br/>
 * @Desc: <br/>
 * @ProjectName: HelloController <br/>
 * @date: 2020/5/23 15:47 <br/>
 * @author: ct <br/>
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public  String index(){
        return "index";
    }
}
