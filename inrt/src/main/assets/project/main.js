
auto.waitFor();

launch("com.tencent.mm");

sleep(3000);

observeToast();

//开启Toast监听，如果出现被微信限制的情况，则停止脚本，并弹出提醒框
function observeToast() {
  events.observeToast();
  events.onToast(function (toast) {
    let txt = toast.getText();
    log(txt);
  });
}