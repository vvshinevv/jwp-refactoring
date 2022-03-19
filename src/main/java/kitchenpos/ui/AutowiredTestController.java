package kitchenpos.ui;

import kitchenpos.application.AutowiredTest2ServiceImp;
import kitchenpos.application.AutowiredTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutowiredTestController {

    @Autowired
    private AutowiredTestService autowiredTest1ServiceImp;

    public void setAutowiredTestService(AutowiredTestService autowiredTestService) {
        this.autowiredTest1ServiceImp = autowiredTestService;
    }

    @RequestMapping(value = "do")
    public String value() {
        setAutowiredTestService(new AutowiredTest2ServiceImp());
        return "aaa";
    }
}
