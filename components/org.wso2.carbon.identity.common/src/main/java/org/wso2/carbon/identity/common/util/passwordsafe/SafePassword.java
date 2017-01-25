/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.common.util.passwordsafe;

import java.io.Serializable;

/**
 * Class holds the information related to RandomPassword.
 */
public class SafePassword implements Serializable {


    private static final long serialVersionUID = -7465588466247931040L;

    private String propertyName;

    //private String password;
    private char[] passwordArray;
    private String randomPhrase;

    public String getRandomPhrase() {
        return randomPhrase;
    }

    public void setRandomPhrase(String randomPhrase) {
        this.randomPhrase = randomPhrase;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPassword() {
        return new String(passwordArray);
    }

    public void setPassword(String password) {
        this.passwordArray = password.toCharArray();
    }

}
