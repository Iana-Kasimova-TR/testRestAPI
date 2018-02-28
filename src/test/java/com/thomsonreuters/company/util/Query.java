package com.thomsonreuters.company.util;

import lombok.Data;
import lombok.NonNull;

/**
 * Created by Iana_Kasimova on 28-Feb-18.
 */
@Data
public class Query {

    @NonNull
    public String url;
    @NonNull
    public String expectedStatusCode;
    @NonNull
    public String queryInDB;

}
