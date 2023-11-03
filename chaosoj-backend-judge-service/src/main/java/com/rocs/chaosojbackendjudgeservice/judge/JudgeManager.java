package com.rocs.chaosojbackendjudgeservice.judge;

import com.rocs.chaosojbackendmodel.model.codesandbox.JudgeInfo;
import com.rocs.chaosojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.rocs.chaosojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.rocs.chaosojbackendjudgeservice.judge.strategy.JudgeContext;
import com.rocs.chaosojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.rocs.chaosojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
