package mychatroom.exception;

import mychatroom.entity.enums.ResponseCodeEnum;

/**
 * 功能：
 * 日期：2024/5/21 上午9:49
 */

public class BussinessException extends RuntimeException {

    private ResponseCodeEnum codeEnum;

    private Integer code;

    private String message;

    public BussinessException(String message, Throwable e) {
        super(message, e);
        this.message = message;
    }

    public BussinessException(String message) {
        super(message);
        this.message = message;
    }

    public BussinessException(Throwable e) {
        super(e);
    }

    public BussinessException(ResponseCodeEnum codeEnum) {
        super(codeEnum.getMsg());
        this.codeEnum = codeEnum;
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMsg();
    }

    public BussinessException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public ResponseCodeEnum getCodeEnum() {
        return codeEnum;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    /**
     * 重写fillInStackTrace 业务异常不需要堆栈信息，提高效率.
     */
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

}
