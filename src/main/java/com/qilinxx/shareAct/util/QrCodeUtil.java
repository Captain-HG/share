package com.qilinxx.shareAct.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: dqsdc
 * @Date: 2018-10-12 15:34
 * @Description:
 */
public class QrCodeUtil {
    public static void create(String content, HttpServletResponse resp) {
        ServletOutputStream stream = null;
        try {
            stream = resp.getOutputStream();
            Map<EncodeHintType, Object> hints = new HashMap<>();
            //编码
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            //边框距
            hints.put(EncodeHintType.MARGIN, 0);
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix bm = qrCodeWriter.encode(content, BarcodeFormat.QR_CODE, 130, 130, hints);
            MatrixToImageWriter.writeToStream(bm, "png", stream);
        } catch (Exception e) {
            e.getStackTrace();

        } finally {
            if (stream != null) {
                try {
                    stream.flush();
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
