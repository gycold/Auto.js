package com.stardust.auojs.inrt;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import java.util.List;

/**
 * package: com.stardust.auojs.inrt.PackageUtils
 * author: gyc
 * description:
 * time: create at 2021-01-04 0004 11:17
 */
public class PackageUtils {
    //抖音包名
    public static final String DOUYIN_PKG = "com.ss.android.ugc.aweme";

    /**
     * 获取抖音版本号
     *
     * @return
     */
    public static String getDouyinVersion(Context context) {
        PackageManager packageManager = context.getPackageManager();
        List<PackageInfo> packages = packageManager.getInstalledPackages(0);
        for (int i = 0; i < packages.size(); i++) {
            PackageInfo packageInfo = packages.get(i);
            //过滤系统应用
            if ((packageInfo.applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) <= 0) {
                if (DOUYIN_PKG.equals(packageInfo.packageName)) {
                    return packageInfo.versionName;
                }
            }
        }
        return "";
    }
}