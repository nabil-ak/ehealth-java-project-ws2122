/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.util;
import java.time.LocalDateTime;
import src.models.*;
import java.util.Random;
/**
 *
 * HTML-Generator for the Mail Class
 * HTML code for the body of the mail was generated on https://unlayer.com/  
 * for the purpose of layout and format only
 */
public class mailHTML {
    
    /**
     * Generate Reminder-Mail 
     * @param appointment
     * @param user
     * @return HTML-Code
     */
    public static String setMailBodyReminder(appointment appointment, user user) {
        Random rand = new Random();
        int minuteINT = appointment.getDateandtime().getMinute();
        String minute = String.valueOf(minuteINT);
        if(minuteINT < 10){
            minute = "0"+minute;
        }
        return  "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">"+
"<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">"+
"<head>"+
"<!--[if gte mso 9]>"+
"<xml>"+
"  <o:OfficeDocumentSettings>"+
"    <o:AllowPNG/>"+
"    <o:PixelsPerInch>96</o:PixelsPerInch>"+
"  </o:OfficeDocumentSettings>"+
"</xml>"+
"<![endif]-->"+
"  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">"+
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"+
"  <meta name=\"x-apple-disable-message-reformatting\">"+
"  <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->"+
"  <title></title>"+
"  "+
"    <style type=\"text/css\">"+
"      table, td { color: #000000; } @media only screen and (min-width: 670px) {"+
"  .u-row {"+
"    width: 650px !important;"+
"  }"+
"  .u-row .u-col {"+
"    vertical-align: top;"+
"  }"+
""+
"  .u-row .u-col-100 {"+
"    width: 650px !important;"+
"  }"+
""+
"}"+
""+
"@media (max-width: 670px) {"+
"  .u-row-container {"+
"    max-width: 100% !important;"+
"    padding-left: 0px !important;"+
"    padding-right: 0px !important;"+
"  }"+
"  .u-row .u-col {"+
"    min-width: 320px !important;"+
"    max-width: 100% !important;"+
"    display: block !important;"+
"  }"+
"  .u-row {"+
"    width: calc(100% - 40px) !important;"+
"  }"+
"  .u-col {"+
"    width: 100% !important;"+
"  }"+
"  .u-col > div {"+
"    margin: 0 auto;"+
"  }"+
"}"+
"body {"+
"  margin: 0;"+
"  padding: 0;"+
"}"+
""+
"table,"+
"tr,"+
"td {"+
"  vertical-align: top;"+
"  border-collapse: collapse;"+
"}"+
""+
"p {"+
"  margin: 0;"+
"}"+
""+
".ie-container table,"+
".mso-container table {"+
"  table-layout: fixed;"+
"}"+
""+
"* {"+
"  line-height: inherit;"+
"}"+
""+
"a[x-apple-data-detectors='true'] {"+
"  color: inherit !important;"+
"  text-decoration: none !important;"+
"}"+
""+
"</style>"+
"  "+
"  "+
""+
"<!--[if !mso]><!--><link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\"><!--<![endif]-->"+
""+
"</head>"+
""+
"<body class=\"clean-body u_body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;color: #000000\">"+
"  <!--[if IE]><div class=\"ie-container\"><![endif]-->"+
"  <!--[if mso]><div class=\"mso-container\"><![endif]-->"+
"  <table style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: transparent;width:100%\" cellpadding=\"0\" cellspacing=\"0\">"+
"  <tbody>"+
"  <tr style=\"vertical-align: top\">"+
"    <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">"+
"    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: transparent;\"><![endif]-->"+
"    "+
""+
"<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">"+
"  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 650px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">"+
"    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">"+
"      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:650px;\"><tr style=\"background-color: transparent;\"><![endif]-->"+
"      "+
"<!--[if (mso)|(IE)]><td align=\"center\" width=\"650\" style=\"background-color: #0f5f54;width: 650px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->"+
"<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 650px;display: table-cell;vertical-align: top;\">"+
"  <div style=\"background-color: #0f5f54;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">"+
"  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->"+
"  "+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:8px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">"+
"  <tr>"+
"    <td style=\"padding-right: 0px;padding-left: 0px;\" align=\"left\">"+
"      "+
"      <img align=\"left\" border=\"0\" src=\"https://s3.amazonaws.com/unroll-images-production/projects%2F57757%2F1642075667715-appicon.png\" alt=\"company logo\" title=\"company logo\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 9%;max-width: 57.06px;\" width=\"57.06\"/>"+
"      "+
"    </td>"+
"  </tr>"+
"</table>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->"+
"  </div>"+
"</div>"+
"<!--[if (mso)|(IE)]></td><![endif]-->"+
"      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->"+
"    </div>"+
"  </div>"+
"</div>"+
""+
""+
""+
"<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">"+
"  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 650px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #fcfcfc;\">"+
"    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">"+
"      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:650px;\"><tr style=\"background-color: #fcfcfc;\"><![endif]-->"+
"      "+
"<!--[if (mso)|(IE)]><td align=\"center\" width=\"650\" style=\"width: 650px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->"+
"<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 650px;display: table-cell;vertical-align: top;\">"+
"  <div style=\"width: 100% !important;\">"+
"  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->"+
"  "+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:25px 10px 25px 24px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"color: #666666; line-height: 140%; text-align: center; word-wrap: break-word;\">"+
"    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 22px; line-height: 30.8px; font-family: Montserrat, sans-serif;\"><span style=\"color: #000000; line-height: 30.8px; font-family: 'trebuchet ms', geneva; font-size: 22px;\"><strong>eHealth</strong> Appointment Booking System</span><br /></span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 10px 10px 25px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"line-height: 140%; text-align: left; word-wrap: break-word;\">"+
"    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 16px; line-height: 22.4px;\">Hi "+user.getFirstname()+",<br /></span></p>"+
"<p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 16px; line-height: 22.4px;\">this email is to remind you of your appointment with <span style=\"background-color: #bfedd2; font-size: 16px; line-height: 22.4px;\">"+appointment.getDoctor().getName()+"</span>. See details below:</span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"<table id=\"appointmentinfo\" class=\"appointment_information\" style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 10px 15px 55px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"color: #000000; line-height: 140%; text-align: left; word-wrap: break-word;\">"+
"    <p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif; background-color: #bfedd2;\">When:</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif;\">"+appointment.getDateandtime().getDayOfMonth()+"/"+appointment.getDateandtime().getMonthValue()+"/"+appointment.getDateandtime().getYear()+" "+appointment.getDateandtime().getHour()+":"+minute+"</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"> </p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif; background-color: #bfedd2;\">Where:</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif; background-color: #ffffff;\">"+appointment.getDoctor().getAddress()+"</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"> </p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif; background-color: #bfedd2;\">Contact Information:</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif;\">0"+rand.nextInt(10, 99)+"/"+rand.nextInt(100000, 999999)+"</span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">"+
"    <tbody>"+
"      <tr style=\"vertical-align: top\">"+
"        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">"+
"          <span> </span>"+
"        </td>"+
"      </tr>"+
"    </tbody>"+
"  </table>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 30px 30px 25px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"color: #5a5a5a; line-height: 150%; text-align: left; word-wrap: break-word;\">"+
"    <p style=\"font-size: 14px; line-height: 150%; text-align: left;\"><span style=\"color: #000000; font-size: 16px; line-height: 24px; font-family: helvetica, sans-serif;\">You are also welcome to contact the corresponding doctor's office by phone to arrange a new appointment. </span></p>"+
"<p style=\"font-size: 14px; line-height: 150%; text-align: left;\"> </p>"+
"<p style=\"font-size: 14px; line-height: 150%; text-align: left;\"><span style=\"color: #000000; font-size: 16px; line-height: 24px; font-family: helvetica, sans-serif;\">Kind regards,<br /></span></p>"+
"<p style=\"font-size: 14px; line-height: 150%; text-align: left;\"><span style=\"color: #000000; font-size: 16px; line-height: 24px; font-family: helvetica, sans-serif;\">Your <span style=\"line-height: 24px; font-size: 16px;\">Appointment</span> Booking System Team</span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->"+
"  </div>"+
"</div>"+
"<!--[if (mso)|(IE)]></td><![endif]-->"+
"      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->"+
"    </div>"+
"  </div>"+
"</div>"+
""+
""+
""+
"<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">"+
"  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 650px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #cccccc;\">"+
"    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">"+
"      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:650px;\"><tr style=\"background-color: #cccccc;\"><![endif]-->"+
"      "+
"<!--[if (mso)|(IE)]><td align=\"center\" width=\"650\" style=\"width: 650px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->"+
"<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 650px;display: table-cell;vertical-align: top;\">"+
"  <div style=\"width: 100% !important;\">"+
"  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->"+
"  "+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:15px 20px 20px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"color: #ffffff; line-height: 140%; text-align: center; word-wrap: break-word;\">"+
"    <p dir=\"ltr\" style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px; font-family: 'trebuchet ms', geneva;\">Nibelungenplatz 1, Gebäude 1,<br />60318 Frankfurt am Main, Deutschland</span></p>"+
"<p dir=\"ltr\" style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px; font-family: 'trebuchet ms', geneva;\">Email: ehealthservicesystem@gmail.com</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%;\"> </p>"+
"<p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 12px; line-height: 16.8px; font-family: 'trebuchet ms', geneva;\">©2022 All rights reserved eHealth.</span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->"+
"  </div>"+
"</div>"+
"<!--[if (mso)|(IE)]></td><![endif]-->"+
"      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->"+
"    </div>"+
"  </div>"+
"</div>"+
""+
""+
"    <!--[if (mso)|(IE)]></td></tr></table><![endif]-->"+
"    </td>"+
"  </tr>"+
"  </tbody>"+
"  </table>"+
"  <!--[if mso]></div><![endif]-->"+
"  <!--[if IE]></div><![endif]-->"+
"</body>"+
""+
"</html>";
	

	

	

    }
    
    /**
     * Generate Cancel-Mail 
     * @param appointment
     * @param user
     * @return HTML-Code
     */
    public static String setMailBodyCancel(appointment appointment, user user) {
        Random rand = new Random();
        int minuteINT = appointment.getDateandtime().getMinute();
        String minute = String.valueOf(minuteINT);
        if(minuteINT < 10){
            minute = "0"+minute;
        }
        return "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">"+
"<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">"+
"<head>"+
"<!--[if gte mso 9]>"+
"<xml>"+
"  <o:OfficeDocumentSettings>"+
"    <o:AllowPNG/>"+
"    <o:PixelsPerInch>96</o:PixelsPerInch>"+
"  </o:OfficeDocumentSettings>"+
"</xml>"+
"<![endif]-->"+
"  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">"+
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"+
"  <meta name=\"x-apple-disable-message-reformatting\">"+
"  <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->"+
"  <title></title>"+
"  "+
"    <style type=\"text/css\">"+
"      table, td { color: #000000; } @media only screen and (min-width: 670px) {"+
"  .u-row {"+
"    width: 650px !important;"+
"  }"+
"  .u-row .u-col {"+
"    vertical-align: top;"+
"  }"+
""+
"  .u-row .u-col-100 {"+
"    width: 650px !important;"+
"  }"+
""+
"}"+
""+
"@media (max-width: 670px) {"+
"  .u-row-container {"+
"    max-width: 100% !important;"+
"    padding-left: 0px !important;"+
"    padding-right: 0px !important;"+
"  }"+
"  .u-row .u-col {"+
"    min-width: 320px !important;"+
"    max-width: 100% !important;"+
"    display: block !important;"+
"  }"+
"  .u-row {"+
"    width: calc(100% - 40px) !important;"+
"  }"+
"  .u-col {"+
"    width: 100% !important;"+
"  }"+
"  .u-col > div {"+
"    margin: 0 auto;"+
"  }"+
"}"+
"body {"+
"  margin: 0;"+
"  padding: 0;"+
"}"+
""+
"table,"+
"tr,"+
"td {"+
"  vertical-align: top;"+
"  border-collapse: collapse;"+
"}"+
""+
"p {"+
"  margin: 0;"+
"}"+
""+
".ie-container table,"+
".mso-container table {"+
"  table-layout: fixed;"+
"}"+
""+
"* {"+
"  line-height: inherit;"+
"}"+
""+
"a[x-apple-data-detectors='true'] {"+
"  color: inherit !important;"+
"  text-decoration: none !important;"+
"}"+
""+
"</style>"+
"  "+
"  "+
""+
"<!--[if !mso]><!--><link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\"><!--<![endif]-->"+
""+
"</head>"+
""+
"<body class=\"clean-body u_body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;color: #000000\">"+
"  <!--[if IE]><div class=\"ie-container\"><![endif]-->"+
"  <!--[if mso]><div class=\"mso-container\"><![endif]-->"+
"  <table style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: transparent;width:100%\" cellpadding=\"0\" cellspacing=\"0\">"+
"  <tbody>"+
"  <tr style=\"vertical-align: top\">"+
"    <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">"+
"    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: transparent;\"><![endif]-->"+
"    "+
""+
"<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">"+
"  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 650px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">"+
"    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">"+
"      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:650px;\"><tr style=\"background-color: transparent;\"><![endif]-->"+
"      "+
"<!--[if (mso)|(IE)]><td align=\"center\" width=\"650\" style=\"background-color: #0f5f54;width: 650px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->"+
"<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 650px;display: table-cell;vertical-align: top;\">"+
"  <div style=\"background-color: #0f5f54;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">"+
"  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->"+
"  "+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:8px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">"+
"  <tr>"+
"    <td style=\"padding-right: 0px;padding-left: 0px;\" align=\"left\">"+
"      "+
"      <img align=\"left\" border=\"0\" src=\"https://s3.amazonaws.com/unroll-images-production/projects%2F57757%2F1642075667715-appicon.png\" alt=\"company logo\" title=\"company logo\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 9%;max-width: 57.06px;\" width=\"57.06\"/>"+
"      "+
"    </td>"+
"  </tr>"+
"</table>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->"+
"  </div>"+
"</div>"+
"<!--[if (mso)|(IE)]></td><![endif]-->"+
"      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->"+
"    </div>"+
"  </div>"+
"</div>"+
""+
""+
""+
"<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">"+
"  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 650px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #fcfcfc;\">"+
"    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">"+
"      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:650px;\"><tr style=\"background-color: #fcfcfc;\"><![endif]-->"+
"      "+
"<!--[if (mso)|(IE)]><td align=\"center\" width=\"650\" style=\"width: 650px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->"+
"<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 650px;display: table-cell;vertical-align: top;\">"+
"  <div style=\"width: 100% !important;\">"+
"  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->"+
"  "+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:25px 10px 25px 24px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"color: #666666; line-height: 140%; text-align: center; word-wrap: break-word;\">"+
"    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 22px; line-height: 30.8px; font-family: Montserrat, sans-serif;\"><span style=\"color: #000000; line-height: 30.8px; font-family: 'trebuchet ms', geneva; font-size: 22px;\"><strong>eHealth</strong> Appointment Booking System</span><br /></span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 10px 10px 25px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"line-height: 140%; text-align: left; word-wrap: break-word;\">"+
"    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 16px; line-height: 22.4px;\">Hi "+user.getFirstname()+",<br /></span></p>"+
"<p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 16px; line-height: 22.4px;\">your appointment with <span style=\"background-color: #bfedd2; font-size: 16px; line-height: 22.4px;\">"+appointment.getDoctor().getName()+"</span> got <b>cancelled</b>. See details below:</span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"<table id=\"appointmentinfo\" class=\"appointment_information\" style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 10px 15px 55px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"color: #000000; line-height: 140%; text-align: left; word-wrap: break-word;\">"+
"    <p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif; background-color: #bfedd2;\">When:</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif;\"><s>"+appointment.getDateandtime().getDayOfMonth()+"/"+appointment.getDateandtime().getMonthValue()+"/"+appointment.getDateandtime().getYear()+" "+appointment.getDateandtime().getHour()+":"+minute+"</s></span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"> </p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif; background-color: #bfedd2;\">Where:</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif; background-color: #ffffff;\"><s>"+appointment.getDoctor().getAddress()+"</s></span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"> </p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif; background-color: #bfedd2;\">Contact Information:</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif;\"><s>0"+rand.nextInt(10, 99)+"/"+rand.nextInt(100000, 999999)+"</s></span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">"+
"    <tbody>"+
"      <tr style=\"vertical-align: top\">"+
"        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">"+
"          <span> </span>"+
"        </td>"+
"      </tr>"+
"    </tbody>"+
"  </table>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 30px 30px 25px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"color: #5a5a5a; line-height: 150%; text-align: left; word-wrap: break-word;\">"+
"    <p style=\"font-size: 14px; line-height: 150%; text-align: left;\"><span style=\"color: #000000; font-size: 16px; line-height: 24px; font-family: helvetica, sans-serif;\">You are also welcome to contact the corresponding doctor's office by phone to arrange a new appointment. </span></p>"+
"<p style=\"font-size: 14px; line-height: 150%; text-align: left;\"> </p>"+
"<p style=\"font-size: 14px; line-height: 150%; text-align: left;\"><span style=\"color: #000000; font-size: 16px; line-height: 24px; font-family: helvetica, sans-serif;\">Kind regards,<br /></span></p>"+
"<p style=\"font-size: 14px; line-height: 150%; text-align: left;\"><span style=\"color: #000000; font-size: 16px; line-height: 24px; font-family: helvetica, sans-serif;\">Your <span style=\"line-height: 24px; font-size: 16px;\">Appointment</span> Booking System Team</span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->"+
"  </div>"+
"</div>"+
"<!--[if (mso)|(IE)]></td><![endif]-->"+
"      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->"+
"    </div>"+
"  </div>"+
"</div>"+
""+
""+
""+
"<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">"+
"  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 650px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #cccccc;\">"+
"    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">"+
"      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:650px;\"><tr style=\"background-color: #cccccc;\"><![endif]-->"+
"      "+
"<!--[if (mso)|(IE)]><td align=\"center\" width=\"650\" style=\"width: 650px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->"+
"<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 650px;display: table-cell;vertical-align: top;\">"+
"  <div style=\"width: 100% !important;\">"+
"  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->"+
"  "+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:15px 20px 20px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"color: #ffffff; line-height: 140%; text-align: center; word-wrap: break-word;\">"+
"    <p dir=\"ltr\" style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px; font-family: 'trebuchet ms', geneva;\">Nibelungenplatz 1, Gebäude 1,<br />60318 Frankfurt am Main, Deutschland</span></p>"+
"<p dir=\"ltr\" style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px; font-family: 'trebuchet ms', geneva;\">Email: ehealthservicesystem@gmail.com</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%;\"> </p>"+
"<p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 12px; line-height: 16.8px; font-family: 'trebuchet ms', geneva;\">©2022 All rights reserved eHealth.</span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->"+
"  </div>"+
"</div>"+
"<!--[if (mso)|(IE)]></td><![endif]-->"+
"      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->"+
"    </div>"+
"  </div>"+
"</div>"+
""+
""+
"    <!--[if (mso)|(IE)]></td></tr></table><![endif]-->"+
"    </td>"+
"  </tr>"+
"  </tbody>"+
"  </table>"+
"  <!--[if mso]></div><![endif]-->"+
"  <!--[if IE]></div><![endif]-->"+
"</body>"+
""+
"</html>";
	

                
    }
    
    /**
     * Generate Move-Appointment-Mail 
     * @param appointment
     * @param user
     * @param old old Date and Time
     * @return HTML-Code
     */
    public static String setMailBodyMove(appointment appointment, user user, LocalDateTime old) {
        Random rand = new Random();
        int minuteINT = appointment.getDateandtime().getMinute();
        String minute = String.valueOf(minuteINT);
        if(minuteINT < 10){
            minute = "0"+minute;
        }
        
        int oldminuteINT = old.getMinute();
        String oldminute = String.valueOf(oldminuteINT);
        if(oldminuteINT < 10){
            oldminute = "0"+oldminute;
        }
        
        return "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">"+
"<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">"+
"<head>"+
"<!--[if gte mso 9]>"+
"<xml>"+
"  <o:OfficeDocumentSettings>"+
"    <o:AllowPNG/>"+
"    <o:PixelsPerInch>96</o:PixelsPerInch>"+
"  </o:OfficeDocumentSettings>"+
"</xml>"+
"<![endif]-->"+
"  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">"+
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"+
"  <meta name=\"x-apple-disable-message-reformatting\">"+
"  <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->"+
"  <title></title>"+
"  "+
"    <style type=\"text/css\">"+
"      table, td { color: #000000; } @media only screen and (min-width: 670px) {"+
"  .u-row {"+
"    width: 650px !important;"+
"  }"+
"  .u-row .u-col {"+
"    vertical-align: top;"+
"  }"+
""+
"  .u-row .u-col-100 {"+
"    width: 650px !important;"+
"  }"+
""+
"}"+
""+
"@media (max-width: 670px) {"+
"  .u-row-container {"+
"    max-width: 100% !important;"+
"    padding-left: 0px !important;"+
"    padding-right: 0px !important;"+
"  }"+
"  .u-row .u-col {"+
"    min-width: 320px !important;"+
"    max-width: 100% !important;"+
"    display: block !important;"+
"  }"+
"  .u-row {"+
"    width: calc(100% - 40px) !important;"+
"  }"+
"  .u-col {"+
"    width: 100% !important;"+
"  }"+
"  .u-col > div {"+
"    margin: 0 auto;"+
"  }"+
"}"+
"body {"+
"  margin: 0;"+
"  padding: 0;"+
"}"+
""+
"table,"+
"tr,"+
"td {"+
"  vertical-align: top;"+
"  border-collapse: collapse;"+
"}"+
""+
"p {"+
"  margin: 0;"+
"}"+
""+
".ie-container table,"+
".mso-container table {"+
"  table-layout: fixed;"+
"}"+
""+
"* {"+
"  line-height: inherit;"+
"}"+
""+
"a[x-apple-data-detectors='true'] {"+
"  color: inherit !important;"+
"  text-decoration: none !important;"+
"}"+
""+
"</style>"+
"  "+
"  "+
""+
"<!--[if !mso]><!--><link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\"><!--<![endif]-->"+
""+
"</head>"+
""+
"<body class=\"clean-body u_body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;color: #000000\">"+
"  <!--[if IE]><div class=\"ie-container\"><![endif]-->"+
"  <!--[if mso]><div class=\"mso-container\"><![endif]-->"+
"  <table style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: transparent;width:100%\" cellpadding=\"0\" cellspacing=\"0\">"+
"  <tbody>"+
"  <tr style=\"vertical-align: top\">"+
"    <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">"+
"    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: transparent;\"><![endif]-->"+
"    "+
""+
"<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">"+
"  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 650px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">"+
"    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">"+
"      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:650px;\"><tr style=\"background-color: transparent;\"><![endif]-->"+
"      "+
"<!--[if (mso)|(IE)]><td align=\"center\" width=\"650\" style=\"background-color: #0f5f54;width: 650px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->"+
"<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 650px;display: table-cell;vertical-align: top;\">"+
"  <div style=\"background-color: #0f5f54;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">"+
"  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->"+
"  "+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:8px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">"+
"  <tr>"+
"    <td style=\"padding-right: 0px;padding-left: 0px;\" align=\"left\">"+
"      "+
"      <img align=\"left\" border=\"0\" src=\"https://s3.amazonaws.com/unroll-images-production/projects%2F57757%2F1642075667715-appicon.png\" alt=\"company logo\" title=\"company logo\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 9%;max-width: 57.06px;\" width=\"57.06\"/>"+
"      "+
"    </td>"+
"  </tr>"+
"</table>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->"+
"  </div>"+
"</div>"+
"<!--[if (mso)|(IE)]></td><![endif]-->"+
"      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->"+
"    </div>"+
"  </div>"+
"</div>"+
""+
""+
""+
"<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">"+
"  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 650px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #fcfcfc;\">"+
"    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">"+
"      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:650px;\"><tr style=\"background-color: #fcfcfc;\"><![endif]-->"+
"      "+
"<!--[if (mso)|(IE)]><td align=\"center\" width=\"650\" style=\"width: 650px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->"+
"<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 650px;display: table-cell;vertical-align: top;\">"+
"  <div style=\"width: 100% !important;\">"+
"  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->"+
"  "+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:25px 10px 25px 24px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"color: #666666; line-height: 140%; text-align: center; word-wrap: break-word;\">"+
"    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 22px; line-height: 30.8px; font-family: Montserrat, sans-serif;\"><span style=\"color: #000000; line-height: 30.8px; font-family: 'trebuchet ms', geneva; font-size: 22px;\"><strong>eHealth</strong> Appointment Booking System</span><br /></span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 10px 10px 25px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"line-height: 140%; text-align: left; word-wrap: break-word;\">"+
"    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 16px; line-height: 22.4px;\">Hi "+user.getFirstname()+",<br /></span></p>"+
"<p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 16px; line-height: 22.4px;\">your appointment with <span style=\"background-color: #bfedd2; font-size: 16px; line-height: 22.4px;\">"+appointment.getDoctor().getName()+"</span> got <b>rescheduled</b>. See details below:</span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"<table id=\"appointmentinfo\" class=\"appointment_information\" style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 10px 15px 55px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"color: #000000; line-height: 140%; text-align: left; word-wrap: break-word;\">"+
"    <p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif; background-color: #bfedd2;\">When:</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif;\"><s>"+old.getDayOfMonth()+"/"+old.getMonthValue()+"/"+old.getYear()+" "+old.getHour()+":"+oldminute+"</s>  -> "+appointment.getDateandtime().getDayOfMonth()+"/"+appointment.getDateandtime().getMonthValue()+"/"+appointment.getDateandtime().getYear()+" "+appointment.getDateandtime().getHour()+":"+minute+"</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"> </p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif; background-color: #bfedd2;\">Where:</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif; background-color: #ffffff;\">"+appointment.getDoctor().getAddress()+"</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"> </p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif; background-color: #bfedd2;\">Contact Information:</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif;\">0"+rand.nextInt(10, 99)+"/"+rand.nextInt(100000, 999999)+"</span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">"+
"    <tbody>"+
"      <tr style=\"vertical-align: top\">"+
"        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">"+
"          <span> </span>"+
"        </td>"+
"      </tr>"+
"    </tbody>"+
"  </table>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 30px 30px 25px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"color: #5a5a5a; line-height: 150%; text-align: left; word-wrap: break-word;\">"+
"    <p style=\"font-size: 14px; line-height: 150%; text-align: left;\"><span style=\"color: #000000; font-size: 16px; line-height: 24px; font-family: helvetica, sans-serif;\">You are also welcome to contact the corresponding doctor's office by phone to arrange a new appointment. </span></p>"+
"<p style=\"font-size: 14px; line-height: 150%; text-align: left;\"> </p>"+
"<p style=\"font-size: 14px; line-height: 150%; text-align: left;\"><span style=\"color: #000000; font-size: 16px; line-height: 24px; font-family: helvetica, sans-serif;\">Kind regards,<br /></span></p>"+
"<p style=\"font-size: 14px; line-height: 150%; text-align: left;\"><span style=\"color: #000000; font-size: 16px; line-height: 24px; font-family: helvetica, sans-serif;\">Your <span style=\"line-height: 24px; font-size: 16px;\">Appointment</span> Booking System Team</span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->"+
"  </div>"+
"</div>"+
"<!--[if (mso)|(IE)]></td><![endif]-->"+
"      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->"+
"    </div>"+
"  </div>"+
"</div>"+
""+
""+
""+
"<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">"+
"  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 650px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #cccccc;\">"+
"    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">"+
"      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:650px;\"><tr style=\"background-color: #cccccc;\"><![endif]-->"+
"      "+
"<!--[if (mso)|(IE)]><td align=\"center\" width=\"650\" style=\"width: 650px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->"+
"<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 650px;display: table-cell;vertical-align: top;\">"+
"  <div style=\"width: 100% !important;\">"+
"  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->"+
"  "+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:15px 20px 20px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"color: #ffffff; line-height: 140%; text-align: center; word-wrap: break-word;\">"+
"    <p dir=\"ltr\" style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px; font-family: 'trebuchet ms', geneva;\">Nibelungenplatz 1, Gebäude 1,<br />60318 Frankfurt am Main, Deutschland</span></p>"+
"<p dir=\"ltr\" style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px; font-family: 'trebuchet ms', geneva;\">Email: ehealthservicesystem@gmail.com</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%;\"> </p>"+
"<p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 12px; line-height: 16.8px; font-family: 'trebuchet ms', geneva;\">©2022 All rights reserved eHealth.</span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->"+
"  </div>"+
"</div>"+
"<!--[if (mso)|(IE)]></td><![endif]-->"+
"      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->"+
"    </div>"+
"  </div>"+
"</div>"+
""+
""+
"    <!--[if (mso)|(IE)]></td></tr></table><![endif]-->"+
"    </td>"+
"  </tr>"+
"  </tbody>"+
"  </table>"+
"  <!--[if mso]></div><![endif]-->"+
"  <!--[if IE]></div><![endif]-->"+
"</body>"+
""+
"</html>";
	

                
    }
    
    /**
     * Generate Create-Appointment-Mail 
     * @param appointment
     * @param user
     * @return HTML-Code
     */
    public static String setMailBodyCreated(appointment appointment, user user) {
        Random rand = new Random();
        int minuteINT = appointment.getDateandtime().getMinute();
        String minute = String.valueOf(minuteINT);
        if(minuteINT < 10){
            minute = "0"+minute;
        }
        return "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">"+
"<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">"+
"<head>"+
"<!--[if gte mso 9]>"+
"<xml>"+
"  <o:OfficeDocumentSettings>"+
"    <o:AllowPNG/>"+
"    <o:PixelsPerInch>96</o:PixelsPerInch>"+
"  </o:OfficeDocumentSettings>"+
"</xml>"+
"<![endif]-->"+
"  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">"+
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"+
"  <meta name=\"x-apple-disable-message-reformatting\">"+
"  <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->"+
"  <title></title>"+
"  "+
"    <style type=\"text/css\">"+
"      table, td { color: #000000; } @media only screen and (min-width: 670px) {"+
"  .u-row {"+
"    width: 650px !important;"+
"  }"+
"  .u-row .u-col {"+
"    vertical-align: top;"+
"  }"+
""+
"  .u-row .u-col-100 {"+
"    width: 650px !important;"+
"  }"+
""+
"}"+
""+
"@media (max-width: 670px) {"+
"  .u-row-container {"+
"    max-width: 100% !important;"+
"    padding-left: 0px !important;"+
"    padding-right: 0px !important;"+
"  }"+
"  .u-row .u-col {"+
"    min-width: 320px !important;"+
"    max-width: 100% !important;"+
"    display: block !important;"+
"  }"+
"  .u-row {"+
"    width: calc(100% - 40px) !important;"+
"  }"+
"  .u-col {"+
"    width: 100% !important;"+
"  }"+
"  .u-col > div {"+
"    margin: 0 auto;"+
"  }"+
"}"+
"body {"+
"  margin: 0;"+
"  padding: 0;"+
"}"+
""+
"table,"+
"tr,"+
"td {"+
"  vertical-align: top;"+
"  border-collapse: collapse;"+
"}"+
""+
"p {"+
"  margin: 0;"+
"}"+
""+
".ie-container table,"+
".mso-container table {"+
"  table-layout: fixed;"+
"}"+
""+
"* {"+
"  line-height: inherit;"+
"}"+
""+
"a[x-apple-data-detectors='true'] {"+
"  color: inherit !important;"+
"  text-decoration: none !important;"+
"}"+
""+
"</style>"+
"  "+
"  "+
""+
"<!--[if !mso]><!--><link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\"><!--<![endif]-->"+
""+
"</head>"+
""+
"<body class=\"clean-body u_body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;color: #000000\">"+
"  <!--[if IE]><div class=\"ie-container\"><![endif]-->"+
"  <!--[if mso]><div class=\"mso-container\"><![endif]-->"+
"  <table style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: transparent;width:100%\" cellpadding=\"0\" cellspacing=\"0\">"+
"  <tbody>"+
"  <tr style=\"vertical-align: top\">"+
"    <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">"+
"    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: transparent;\"><![endif]-->"+
"    "+
""+
"<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">"+
"  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 650px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">"+
"    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">"+
"      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:650px;\"><tr style=\"background-color: transparent;\"><![endif]-->"+
"      "+
"<!--[if (mso)|(IE)]><td align=\"center\" width=\"650\" style=\"background-color: #0f5f54;width: 650px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->"+
"<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 650px;display: table-cell;vertical-align: top;\">"+
"  <div style=\"background-color: #0f5f54;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">"+
"  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->"+
"  "+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:8px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">"+
"  <tr>"+
"    <td style=\"padding-right: 0px;padding-left: 0px;\" align=\"left\">"+
"      "+
"      <img align=\"left\" border=\"0\" src=\"https://s3.amazonaws.com/unroll-images-production/projects%2F57757%2F1642075667715-appicon.png\" alt=\"company logo\" title=\"company logo\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 9%;max-width: 57.06px;\" width=\"57.06\"/>"+
"      "+
"    </td>"+
"  </tr>"+
"</table>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->"+
"  </div>"+
"</div>"+
"<!--[if (mso)|(IE)]></td><![endif]-->"+
"      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->"+
"    </div>"+
"  </div>"+
"</div>"+
""+
""+
""+
"<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">"+
"  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 650px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #fcfcfc;\">"+
"    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">"+
"      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:650px;\"><tr style=\"background-color: #fcfcfc;\"><![endif]-->"+
"      "+
"<!--[if (mso)|(IE)]><td align=\"center\" width=\"650\" style=\"width: 650px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->"+
"<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 650px;display: table-cell;vertical-align: top;\">"+
"  <div style=\"width: 100% !important;\">"+
"  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->"+
"  "+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:25px 10px 25px 24px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"color: #666666; line-height: 140%; text-align: center; word-wrap: break-word;\">"+
"    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 22px; line-height: 30.8px; font-family: Montserrat, sans-serif;\"><span style=\"color: #000000; line-height: 30.8px; font-family: 'trebuchet ms', geneva; font-size: 22px;\"><strong>eHealth</strong> Appointment Booking System</span><br /></span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 10px 10px 25px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"line-height: 140%; text-align: left; word-wrap: break-word;\">"+
"    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 16px; line-height: 22.4px;\">Hi "+user.getFirstname()+",<br /></span></p>"+
"<p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 16px; line-height: 22.4px;\">this is your confirmation of the appointment with <span style=\"background-color: #bfedd2; font-size: 16px; line-height: 22.4px;\">"+appointment.getDoctor().getName()+"</span>. See details below:</span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"<table id=\"appointmentinfo\" class=\"appointment_information\" style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 10px 15px 55px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"color: #000000; line-height: 140%; text-align: left; word-wrap: break-word;\">"+
"    <p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif; background-color: #bfedd2;\">When:</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif;\">"+appointment.getDateandtime().getDayOfMonth()+"/"+appointment.getDateandtime().getMonthValue()+"/"+appointment.getDateandtime().getYear()+" "+appointment.getDateandtime().getHour()+":"+minute+"</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"> </p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif; background-color: #bfedd2;\">Where:</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif; background-color: #ffffff;\">"+appointment.getDoctor().getAddress()+"</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"> </p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif; background-color: #bfedd2;\">Contact Information:</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif;\">0"+rand.nextInt(10, 99)+"/"+rand.nextInt(100000, 999999)+"</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"> </p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif; background-color: #bfedd2;\">Health Problem:</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%; text-align: left;\"><span style=\"font-size: 16px; line-height: 22.4px; font-family: helvetica, sans-serif;\">"+appointment.getHealthproblem()+"</span></p>"+                
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #BBBBBB;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">"+
"    <tbody>"+
"      <tr style=\"vertical-align: top\">"+
"        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">"+
"          <span> </span>"+
"        </td>"+
"      </tr>"+
"    </tbody>"+
"  </table>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 30px 30px 25px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"color: #5a5a5a; line-height: 150%; text-align: left; word-wrap: break-word;\">"+
"    <p style=\"font-size: 14px; line-height: 150%; text-align: left;\"><span style=\"color: #000000; font-size: 16px; line-height: 24px; font-family: helvetica, sans-serif;\">You are also welcome to contact the corresponding doctor's office by phone to arrange a new appointment. </span></p>"+
"<p style=\"font-size: 14px; line-height: 150%; text-align: left;\"> </p>"+
"<p style=\"font-size: 14px; line-height: 150%; text-align: left;\"><span style=\"color: #000000; font-size: 16px; line-height: 24px; font-family: helvetica, sans-serif;\">Kind regards,<br /></span></p>"+
"<p style=\"font-size: 14px; line-height: 150%; text-align: left;\"><span style=\"color: #000000; font-size: 16px; line-height: 24px; font-family: helvetica, sans-serif;\">Your <span style=\"line-height: 24px; font-size: 16px;\">Appointment</span> Booking System Team</span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->"+
"  </div>"+
"</div>"+
"<!--[if (mso)|(IE)]></td><![endif]-->"+
"      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->"+
"    </div>"+
"  </div>"+
"</div>"+
""+
""+
""+
"<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">"+
"  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 650px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: #cccccc;\">"+
"    <div style=\"border-collapse: collapse;display: table;width: 100%;background-color: transparent;\">"+
"      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:650px;\"><tr style=\"background-color: #cccccc;\"><![endif]-->"+
"      "+
"<!--[if (mso)|(IE)]><td align=\"center\" width=\"650\" style=\"width: 650px;padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->"+
"<div class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 650px;display: table-cell;vertical-align: top;\">"+
"  <div style=\"width: 100% !important;\">"+
"  <!--[if (!mso)&(!IE)]><!--><div style=\"padding: 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->"+
"  "+
"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">"+
"  <tbody>"+
"    <tr>"+
"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:15px 20px 20px;font-family:arial,helvetica,sans-serif;\" align=\"left\">"+
"        "+
"  <div style=\"color: #ffffff; line-height: 140%; text-align: center; word-wrap: break-word;\">"+
"    <p dir=\"ltr\" style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px; font-family: 'trebuchet ms', geneva;\">Nibelungenplatz 1, Gebäude 1,<br />60318 Frankfurt am Main, Deutschland</span></p>"+
"<p dir=\"ltr\" style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 14px; line-height: 19.6px; font-family: 'trebuchet ms', geneva;\">Email: ehealthservicesystem@gmail.com</span></p>"+
"<p style=\"font-size: 14px; line-height: 140%;\"> </p>"+
"<p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-size: 12px; line-height: 16.8px; font-family: 'trebuchet ms', geneva;\">©2022 All rights reserved eHealth.</span></p>"+
"  </div>"+
""+
"      </td>"+
"    </tr>"+
"  </tbody>"+
"</table>"+
""+
"  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->"+
"  </div>"+
"</div>"+
"<!--[if (mso)|(IE)]></td><![endif]-->"+
"      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->"+
"    </div>"+
"  </div>"+
"</div>"+
""+
""+
"    <!--[if (mso)|(IE)]></td></tr></table><![endif]-->"+
"    </td>"+
"  </tr>"+
"  </tbody>"+
"  </table>"+
"  <!--[if mso]></div><![endif]-->"+
"  <!--[if IE]></div><![endif]-->"+
"</body>"+
""+
"</html>";
	

                
    }
}
