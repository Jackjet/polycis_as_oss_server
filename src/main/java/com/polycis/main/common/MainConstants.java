package com.polycis.main.common;

public class MainConstants {


    public static final String USER ="user";
    public static final String SYS ="sys";
    public static final String SUSYS ="susys";

    // cookie过期时间
    public static final int COOKIE_LIFETIME =3600;

    // redis里token令牌过期时间
    public static final int TOKEN_LIFETIME =3600;

    // is_delete 字段 未删除
    public static final int UN_DELETE =1;

    // is_delete字段 已删除
    public static final int DELETETED =0;


    /**
     * cookie名
     */
    public static String COOKIE_NAME="cncompolycistoken";


    public static final Integer HTTP_PUSH=1;

    // 字典表 产品分类的父id
    public static final Integer DICTIONARY_PRODUCT=1;
}