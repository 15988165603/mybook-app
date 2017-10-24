package com.mybook.app.utils;

import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.*;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 类注释
 *
 * @author: hz
 * @date: 2017/7/4
 * @time: 20:37
 * @see: 链接到其他资源
 * @since: 1.0
 */
public class PdfGenerator {

    public static void createPDF(HttpServletResponse response, String outPdfName, String fileName, Map<String, String> data) throws IOException, DocumentException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        OutputStream os = response.getOutputStream();
        Logger.info(PdfGenerator.class, "开始创建PDF......   导出文件名：" + outPdfName + "模版文件：" + fileName + "数据：" + data);
        try {
            response.setHeader("Content-Disposition", "attachment; filename=" + new String(outPdfName.getBytes("gb2312"), "ISO8859-1"));
            Map<String, Object> param = new HashMap<String, Object>();
            // pdf模板
            Logger.info(PdfGenerator.class, "开始");
            PdfReader reader = new PdfReader(fileName);
        /* 将要生成的目标PDF文件名称 */
            PdfStamper ps = new PdfStamper(reader, bos);
            PdfContentByte under = ps.getUnderContent(1);
          /* 使用中文字体 */
            BaseFont bf = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            ArrayList<BaseFont> fontList = new ArrayList<BaseFont>();
            fontList.add(bf);

        /* 取出报表模板中的所有字段 */
            AcroFields fields = ps.getAcroFields();
            fields.setSubstitutionFonts(fontList);
            fillData(fields, data);

        /* 必须要调用这个，否则文档不会生成的 */
            ps.setFormFlattening(true);
            ps.close();
//            String resultPdf = Thread.currentThread().getContextClassLoader().getResource("resultPdf.pdf").getFile();
//            Logger.info(PdfGenerator.class, "file文件" + resultPdf);
            os.write(bos.toByteArray());
        } catch (Exception e) {
            Logger.error(PdfGenerator.class, "---模板匹配错误---" + e.getMessage(), e);
        } finally {
            bos.close();
            os.flush();
            os.close();
        }
    }

    public static void fillData(AcroFields fields, Map<String, String> data)
            throws IOException, DocumentException {
        for (String key : data.keySet()) {
            String value = data.get(key);
            fields.setField(key, value); // 为字段赋值,注意字段名称是区分大小写的
        }
    }
}
