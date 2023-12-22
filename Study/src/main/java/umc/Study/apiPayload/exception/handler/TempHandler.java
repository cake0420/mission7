package umc.Study.apiPayload.exception.handler;

import umc.Study.apiPayload.code.BaseErrorCode;
import umc.Study.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {
    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
