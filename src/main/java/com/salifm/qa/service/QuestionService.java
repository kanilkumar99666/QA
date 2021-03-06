// SPDX-FileCopyrightText: 2020 Salif Mehmed <salifm@salifm.com>
// SPDX-License-Identifier: MIT

package com.salifm.qa.service;

import com.salifm.qa.model.view.QuestionPreviewViewModel;
import com.salifm.qa.model.view.QuestionViewModel;

import java.util.List;

public interface QuestionService {
    void initQuestions();
    List<QuestionPreviewViewModel> getAllQuestions();
    QuestionViewModel getQuestion(String id);
    String postQuestion(String title, String text, String authorUsername);

    void incViews(String id);
}
