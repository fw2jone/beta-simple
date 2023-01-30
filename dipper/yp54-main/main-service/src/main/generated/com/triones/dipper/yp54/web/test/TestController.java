package com.triones.dipper.yp54.web.test;

import com.triones.core.model.R;
import com.triones.dipper.yp54.api.document.IOnlineDocument;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.triones.core.constants.CoreConstants.URL_PREFIX;

@RestController
@RequestMapping(URL_PREFIX + "/test")
public class TestController {

    @Resource
    private IOnlineDocument iOnlineDocument;

    @GetMapping("/test")
    public R test() {
        iOnlineDocument.test();
        return R.ok();
    }
}
