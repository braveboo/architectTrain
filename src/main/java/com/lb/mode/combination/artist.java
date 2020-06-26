package com.lb.mode.combination;

/**
 * @author liuboyupi
 * @Date 2020-06-26
 * @Description
 */
public class artist {
    public static void main(String[] args) {
        WinForm winForm = new WinForm("Window 窗口");
        Picture picture = new Picture("Logo 图片");
        Button button = new Button("登录");
        Button regButton = new Button("注册");
        Frame frame = new Frame("frame");
        winForm.addComponent(picture).addComponent(button)
                .addComponent(regButton).addComponent(frame);
        Lable lable = new Lable("用户名");
        TextBox textBox = new TextBox("文本框");
        Lable passLable = new LinkLable("密码");
        TextBox passWordBox = new TextBox("密码框");
        CheckBox checkBox = new CheckBox("复选框");
        Lable remberLable = new Lable("记住用户名");
        LinkLable forgetLable = new LinkLable("忘记密码");
        frame.addComponent(lable).addComponent(textBox)
                .addComponent(passLable).addComponent(passWordBox)
                .addComponent(checkBox).addComponent(remberLable)
                .addComponent(forgetLable);
        winForm.render();
    }
}
