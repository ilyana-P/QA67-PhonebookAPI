package com.phonebook.core;

import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import com.phonebook.utils.PropertiesLoader;
import org.testng.asserts.SoftAssert;

public class TestBase {
    protected Gson gson =new Gson();
    protected OkHttpClient client =new OkHttpClient();
    protected SoftAssert softassert=new SoftAssert();

    public static final MediaType JSON = MediaType.get("application/json;charset=utf8");
    public static final String baseUri = PropertiesLoader.loadProperty("url");
    public static final String loginPath = PropertiesLoader.loadProperty("log.in");
    public static final String contactPath = PropertiesLoader.loadProperty("contact.controller");
    public static final String username = PropertiesLoader.loadProperty("valid.email");
    public static final String password = PropertiesLoader.loadProperty("valid.password");

    public static final String token =PropertiesLoader.loadProperty("token");
    public static final String auth=PropertiesLoader.loadProperty("auth");
}
//eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoiaWwucG90bnlhZXZhK3Rlc3QyQGdtYWlsLmNvbSIsImlzcyI6IlJlZ3VsYWl0IiwiZXhwIjoxNzgwNDIyMDg1LCJpYXQiOjE3Nzk4MjIwODV9.X4R_zDId8l8wFLgKmyBq5zD-9yXflS116z4Dx_vzbAY