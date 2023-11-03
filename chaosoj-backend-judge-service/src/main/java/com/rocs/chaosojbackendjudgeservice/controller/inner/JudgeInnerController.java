package com.rocs.chaosojbackendjudgeservice.controller.inner;

import com.rocs.chaosojbackendjudgeservice.judge.JudgeService;
import com.rocs.chaosojbackendmodel.model.entity.QuestionSubmit;
import com.rocs.chaosojbackendserviceclient.service.JudgeFeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inner")
public class JudgeInnerController implements JudgeFeignClient {

    private JudgeService judgeService;
    @Override
    @PostMapping("/do")
    public QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId) {
        return judgeService.doJudge(questionSubmitId);
    }
}
