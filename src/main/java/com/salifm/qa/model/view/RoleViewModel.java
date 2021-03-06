// SPDX-FileCopyrightText: 2020 Salif Mehmed <salifm@salifm.com>
// SPDX-License-Identifier: MIT

package com.salifm.qa.model.view;

import java.util.List;

public class RoleViewModel {
    private String authority;
    private List<UserPreviewViewModel> users;

    public RoleViewModel() {
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public List<UserPreviewViewModel> getUsers() {
        return users;
    }

    public void setUsers(List<UserPreviewViewModel> users) {
        this.users = users;
    }
}
