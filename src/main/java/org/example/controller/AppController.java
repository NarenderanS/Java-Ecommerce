package org.example.controller;

import org.example.controller.impl.IAppController;
import org.example.models.Category;
import org.example.models.Product;
import org.example.utils.ReadFilesUtils;
import org.example.utils.StringUtil;
import org.example.view.WelcomePage;

import static org.example.utils.ReadFilesUtils.getCategoryArr;
import static org.example.utils.ReadFilesUtils.getProductArr;
import static org.example.utils.Utils.print;
import static org.example.utils.Utils.println;

public class AppController implements IAppController {
    WelcomePage welcomePage;
    AuthController authController;


    public AppController() {
        welcomePage = new WelcomePage();
        authController = new AuthController(this);
    }
    @Override
    public void init() {
        welcomePage.welcome();
        authController.authServ();
    }

    @Override
    public void printAuthServ() {
        println(StringUtil.LOGIN_OR_REGISTER);
    }


}
