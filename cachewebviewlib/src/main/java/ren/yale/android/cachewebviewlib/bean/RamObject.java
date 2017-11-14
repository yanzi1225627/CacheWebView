package ren.yale.android.cachewebviewlib.bean;

import java.io.InputStream;
import java.util.Map;

/**
 * Created by yale on 2017/10/10.
 */

public class RamObject {
    private String httpFlag="";
    private InputStream stream;
    private int inputStreamSize = 0;
    private Map headerMap;

    public Map getHeaderMap() {
        return headerMap;
    }

    public void setHeaderMap(Map headerMap) {
        this.headerMap = headerMap;
    }

    public int getInputStreamSize() {
        return inputStreamSize;
    }

    public void setInputStreamSize(int inputStreamSize) {
        this.inputStreamSize = inputStreamSize;
    }

    public InputStream getStream() {
        return stream;
    }
    public void setStream(InputStream stream) {
        this.stream = stream;
    }
    public String getHttpFlag() {
        return httpFlag;
    }

    public void setHttpFlag(String httpFlag) {
        this.httpFlag = httpFlag;
    }


}
