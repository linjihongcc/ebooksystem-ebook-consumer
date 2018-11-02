package cn.bdqn.controller;

import cn.bdqn.Ebook;
import cn.bdqn.EbooksystemEbookConsumerApplication;
import cn.bdqn.service.EbookService;
import com.alibaba.boot.dubbo.annotation.DubboConsumer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class EbookController {
    @DubboConsumer //远程调用
    private EbookService ebookService;

    @RequestMapping(value="/add",method = RequestMethod.POST)
    @ResponseBody
    public HashMap add(Ebook ebook){
        HashMap map = new HashMap();
        int result = ebookService.addEbook(ebook);
        if(result>0){
            map.put("addinfo",true);
        }else {
            map.put("addinfo",false);
        }
        return map;
    }
}
