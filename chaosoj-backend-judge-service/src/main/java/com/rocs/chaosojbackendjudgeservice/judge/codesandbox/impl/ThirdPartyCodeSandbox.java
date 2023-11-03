package com.rocs.chaosojbackendjudgeservice.judge.codesandbox.impl;

import com.rocs.chaosojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.rocs.chaosojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.rocs.chaosojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
