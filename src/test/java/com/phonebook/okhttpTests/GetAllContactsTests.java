package com.phonebook.okhttpTests;

import com.phonebook.core.TestBase;
import com.phonebook.dto.AllContactsDto;
import com.phonebook.dto.ContactDto;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetAllContactsTests extends TestBase {
    @Test
    public void GetAllContactsAllTests() throws IOException {
        Request request = new Request.Builder()
                .url(baseUri + contactPath)
                .get()
                .addHeader(auth, token)
                .build();
        Response response = client.newCall(request).execute();
        Assert.assertTrue(response.isSuccessful());

        AllContactsDto allContactsDto = gson.fromJson(response.body().string(), AllContactsDto.class);
        for (ContactDto contactDto: allContactsDto.getContacts()){
            System.out.println(contactDto.getId());
            System.out.println(contactDto.getName());
        }
    }
}
