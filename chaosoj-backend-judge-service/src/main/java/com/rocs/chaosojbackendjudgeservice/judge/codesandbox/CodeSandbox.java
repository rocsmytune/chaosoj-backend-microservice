package com.rocs.chaosojbackendjudgeservice.judge.codesandbox;

import com.rocs.chaosojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.rocs.chaosojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
