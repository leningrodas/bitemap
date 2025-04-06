package bitmap.bitmap_backend.util;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLogger.Level;
import org.slf4j.ext.XLoggerFactory;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;


public class StringConvertUtil {

    public static final XLogger LOGGER = XLoggerFactory.getXLogger(StringConvertUtil.class);

    /**
     * <h1>convertStringtoBigDecimal</h1>
     * <p>
     * this method is used specifically to avoid fortify issues related to
     * denial-of-service attacks
     * </p>
     *
     * @param str a string containing a numeric valu
     * @return a bigDecimal representation of Str
     */

    public static BigDecimal converStringToBigDecimal(String str) {
        LOGGER.entry(str);
        BigDecimal bigDec = null;
        DecimalFormat decFormat = new DecimalFormat();
        decFormat.setParseBigDecimal(true);
        try {
            bigDec = (str == null || str.isBlank() ? BigDecimal.ZERO : (BigDecimal) decFormat.parse(str));
        } catch (ParseException ex) {
            LOGGER.catching(Level.ERROR, ex);
        }
        LOGGER.exit();
        return bigDec;
    }





}