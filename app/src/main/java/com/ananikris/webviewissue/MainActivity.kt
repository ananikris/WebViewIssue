package com.ananikris.webviewissue

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialiseWebView(findViewById(R.id.webView))
    }

    @SuppressLint("SetJavaScriptEnabled")
    fun initialiseWebView(webView: WebView) {
        webView.settings.defaultTextEncodingName = "UTF-8"
        webView.settings.loadWithOverviewMode = true
        webView.settings.useWideViewPort = true
        webView.loadDataWithBaseURL(
            null,
            contentHtml,
            "text/html", "UTF-8", null
        )
        webView.webViewClient = object : WebViewClient() {

        }
    }


    val contentHtml = """
        <!DOCTYPE html>
        <html>

        <head id="headId">
            <meta name="viewport" content="minimum-scale=1.0,initial-scale=1.0,maximum-scale=1.0">
            <meta http-equiv="Content-Type" content="text/html charset=utf-8">
            <style type="text/css">
                #messageContent {
                    -webkit-tap-highlight-color: rgba(0, 0, 0, 0.0);
                    outline: none;
                }

                a:link {
                    text-decoration: none;
                    color: rgb(32, 132, 243)
                }

                blockquote {
                    border-left: 1px solid #BFBFBF !important;
                    padding-left: 6px;
                    margin-left: 10px;
                }


                div[data-placeholder]:not(:focus):not([data-div-placeholder-content]):before {
                    content: attr(data-placeholder);
                    float: left;
                    color: #808080;
                }

            </style>
        </head>

        <body>
            <div spellcheck="true" id="messageContent" contenteditable="true" data-placeholder="Compose email">
                <div id="message"></div><br id="br3"><br id="br3"><br id="br3">
                <div id="signature">
                    <div>
                        <p style=""><span class="colour" style="color: rgb(42, 42, 42)">Sent using <a href="https://www.zoho.com/mail/" style="color: rgb(89, 143, 222)">Zoho Mail</a></span><br></p>
                    </div>
                </div>
                <div id="content"><br>============ Forwarded Message ============<br>From : crew@morningbrew.com<br>To : sphemanthkrishna@zohomail.com<br>Date : Sun, 21 Nov 2021 18:06:25 +0530<br>Subject : ☕️ Chemistry<br>============ Forwarded Message ============<br><br>
                    <blockquote style="border-left: 1px solid rgb(204, 204, 204); padding-left: 6px; margin-left: 5px;">
                        <meta content="IE=edge">

                        <meta>
                        <meta content="width=device-width, initial-scale=1" name="viewport">
                        <style>
                            @media only screen and (max-width: 670px) {
                                div.zm_9139158635995495328_parse_6711413058801851309 *.x_1950205409column {
                                    padding: 25px 10px
                                }

                                div.zm_9139158635995495328_parse_6711413058801851309 *.x_1950205409img-responsive {
                                    width: 100%
                                }

                                div.zm_9139158635995495328_parse_6711413058801851309 a.x_1950205409survey-option {
                                    font-size: 12px
                                }

                                div.zm_9139158635995495328_parse_6711413058801851309 td.x_1950205409primary-sponsor {
                                    display: block;
                                    width: 100%;
                                    text-align: center;
                                    padding-right: 0px
                                }

                                div.zm_9139158635995495328_parse_6711413058801851309 *.x_1950205409thumbnail-image {
                                    padding: 10px
                                }

                                div.zm_9139158635995495328_parse_6711413058801851309 *.x_1950205409in_this_issue p {
                                    padding: 5px;
                                    font-size: 12px
                                }

                                div.zm_9139158635995495328_parse_6711413058801851309 *.x_1950205409in_this_issue td {
                                    padding-left: 5px;
                                    padding-right: 5px;
                                    padding-top: 15px;
                                    padding-bottom: 15px
                                }

                                div.zm_9139158635995495328_parse_6711413058801851309 *.x_1950205409editors_note {
                                    padding: 0px 20px 16px 20px
                                }

                                div.zm_9139158635995495328_parse_6711413058801851309 *.x_1950205409sponsored-header {
                                    padding: 20px 20px 0px 20px
                                }

                                div.zm_9139158635995495328_parse_6711413058801851309 *.x_1950205409sponsored-header__tag {
                                    line-height: 20px
                                }

                                div.zm_9139158635995495328_parse_6711413058801851309 *.x_1950205409sponsored-header__title {
                                    line-height: 28px;
                                    margin-bottom: 20px
                                }

                                div.zm_9139158635995495328_parse_6711413058801851309 *.x_1950205409sponsored-body {
                                    padding: 0 20px 20px 20px
                                }

                                div.zm_9139158635995495328_parse_6711413058801851309 *.x_1950205409sponsored-header {
                                    padding: 20px 20px 0px 20px
                                }

                                div.zm_9139158635995495328_parse_6711413058801851309 *.x_1950205409sponsored-header__tag {
                                    line-height: 20px
                                }

                                div.zm_9139158635995495328_parse_6711413058801851309 *.x_1950205409sponsored-header__title {
                                    line-height: 28px;
                                    margin-bottom: 20px
                                }

                                div.zm_9139158635995495328_parse_6711413058801851309 *.x_1950205409sponsored-body {
                                    padding: 0 20px 20px 20px
                                }
                            }

                            @media only screen and (min-width: 480px) {
                                div.zm_9139158635995495328_parse_6711413058801851309 *.x_1950205409mj-column-per-100 {
                                    width: 100%;
                                    max-width: 100%
                                }
                            }

                        </style>
                        <div style="margin :  0; padding :  0; box-sizing :  border-box; " class=" zm_9139158635995495328_parse_6711413058801851309">
                            <table style="border-collapse :  collapse; border-collapse :  collapse; table-layout :  fixed; margin :  0 auto; display :  none; ">
                                <tbody>
                                    <tr>
                                        <td style="border-collapse :  collapse; ">
                                            The sports-crypto crossover...
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                            <div class="x_1950205409core_hidden x_1950205409oslo_hidden">
                                <a href="https://link.morningbrew.com/click/25772567.1761477/aHR0cDovL3d3dy5tb3JuaW5nYnJldy5jb20/604a33d1c475c71b34019114B209f3acc" target="_blank"><img id="1637498783205120001_imgsrc_url_0" alt="" border="0" src="https://link.morningbrew.com/img/604a33d1c475c71b34019114fce8n.11r5x/eff80249.gif"></a>
                                <img id="1637498783205120001_imgsrc_url_1" border="0" height="1" width="1" alt="Advertisement" src="https://ad.doubleclick.net/ddm/trackimp/N2992.3407870MORNINGBREW/B25575683.308173559;dc_trk_aid=502010756;dc_trk_cid=154911934;ord=199970751;dc_lat=;dc_rdid=;tag_for_child_directed_treatment=;tfua=;gdpr=${'$'};gdpr_consent=${'$'};ltd=?">
                            </div>
                            <div>

                                <div style="margin :  0px auto; max-width :  670px; width :  100%; ">
                                    <table align="center" border="0" cellpadding="0" cellspacing="0" style="border-collapse :  collapse; width :  100%; ">
                                        <tbody>
                                            <tr>
                                                <td style="border-collapse :  collapse; direction :  ltr; font-size :  0px; text-align :  center; background :  white; ">

                                                    <div class="x_1950205409mj-column-per-100 x_1950205409mj-outlook-group-fix" style="font-size :  0px; text-align :  left; direction :  ltr; display :  inline-block; vertical-align :  top; width :  100%; ">
                                                        <table border="0" cellpadding="0" cellspacing="0" style="border-collapse :  collapse; vertical-align :  top; " width="100%">
                                                            <tbody>
                                                                <tr>
                                                                    <td align="center" style="border-collapse :  collapse; ">
                                                                        <table style="border-collapse :  collapse; ">
                                                                            <tbody>
                                                                                <tr>
                                                                                    <td style="border-collapse :  collapse; ">
                                                                                        <a href="https://link.morningbrew.com/click/25772567.1761477/aHR0cHM6Ly93d3cubW9ybmluZ2JyZXcuY29tL2RhaWx5/604a33d1c475c71b34019114B72843b65" style="text-decoration :  none; border :  none; " target="_blank" class="">
                                                                                            <img style="border :  0; height :  auto; line-height :  100%; outline :  none; text-decoration :  none; width :  100%; max-width :  670px; margin :  0 auto; " width="670" id="1637498783205120001_imgsrc_url_2" src="https://media.sailthru.com/5z8/1k5/3/p/605cd7ff72f18.png">
                                                                                        </a>
                                                                                    </td>
                                                                                </tr>
                                                                            </tbody>
                                                                        </table>
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td style="border-collapse :  collapse; ">
                                                                        <table align="center" border="0" cellpadding="0" cellspacing="0" style="border-collapse :  collapse; border-collapse :  collapse; table-layout :  fixed; margin :  0 auto; ">
                                                                            <tbody>
                                                                                <tr>
                                                                                    <td align="right" class="x_1950205409primary-sponsor" style="border-collapse :  collapse; text-align :  left; font-weight :  400; color :  #252525; padding-right :  8px; font-family :  Roboto,  Arial,  Helvetica,  sans-serif; font-size :  16px; " valign="middle">
                                                                                        <p style="display :  block; margin :  13px 0; line-height :  22px; line-height :  22px; margin-bottom :  15px; color :  #000000; margin-top :  15px; ">
                                                                                            Together with
                                                                                        </p>
                                                                                    </td>
                                                                                    <td class="x_1950205409primary-sponsor" style="border-collapse :  collapse; text-align :  left; font-weight :  400; margin-bottom :  15px; ">
                                                                                        <a style="border-bottom :  none; " target="_blank" href="https://link.morningbrew.com/click/25772567.1761477/aHR0cHM6Ly9hZC5kb3VibGVjbGljay5uZXQvZGRtL3RyYWNrY2xrL04yOTkyLjM0MDc4NzBNT1JOSU5HQlJFVy9CMjU1NzU2ODMuMzA4MTczNTU5O2RjX3Rya19haWQ9NTAyMDEwNzU2O2RjX3Rya19jaWQ9MTU0OTExOTM0O2RjX2xhdD07ZGNfcmRpZD07dGFnX2Zvcl9jaGlsZF9kaXJlY3RlZF90cmVhdG1lbnQ9O3RmdWE9O2x0ZD0/604a33d1c475c71b34019114B6dc44625" class=""><img alt="Vanguard" style="border :  0; height :  auto; line-height :  100%; outline :  none; text-decoration :  none; width :  100%; max-width :  153px; display :  inline; vertical-align :  middle; " width="153" id="1637498783205120001_imgsrc_url_3" src="https://media2.morningbrew.com/uploads/company/logo/713/1628096081-Vanguard.png">
                                                                                        </a>
                                                                                    </td>
                                                                                </tr>
                                                                            </tbody>
                                                                        </table>
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td style="border-collapse :  collapse; ">
                                                                        <table align="center" border="0" cellpadding="0" cellspacing="0" style="border-collapse :  collapse; margin :  0 auto; width :  100%; ">
                                                                            <tbody>
                                                                                <tr>
                                                                                    <td style="border-collapse :  collapse; font-size :  14px; text-align :  center; padding-top :  10px; color :  #1c7ff2; font-family :  Arial,  Helvetica,  sans-serif; ">
                                                                                        <a style="color :  #1c7ff2; text-decoration :  none; " target="_blank" href="https://link.morningbrew.com/click/25772567.1761477/aHR0cHM6Ly93d3cubW9ybmluZ2JyZXcuY29tL2RhaWx5L2lzc3Vlcy9ub3ZlbWJlci0yMT91dG1fc291cmNlPWhlYWRlcl9zaWdudXAmdXRtX21lZGl1bT1uZXdzbGV0dGVyJnV0bV9jYW1wYWlnbj1tYiZtaWQ9NjQ2NGRiODU3YmJmMTM2YjAyMjIzYWFhOTE5YmYyMWI/604a33d1c475c71b34019114B79c33e73">November 21, 2021</a>
                                                                                        <span>|</span>
                                                                                        <a style="color :  #1c7ff2; text-decoration :  none; " target="_blank" href="https://link.morningbrew.com/click/25772567.1761477/aHR0cHM6Ly93d3cubW9ybmluZ2JyZXcuY29tL2RhaWx5L2lzc3Vlcy9ub3ZlbWJlci0yMT9taWQ9NjQ2NGRiODU3YmJmMTM2YjAyMjIzYWFhOTE5YmYyMWImdXRtX3NvdXJjZT1oZWFkZXJfc2lnbnVwJnV0bV9tZWRpdW09bmV3c2xldHRlciZ1dG1fY2FtcGFpZ249bWI/604a33d1c475c71b34019114Cf1c197e1">View Online</a>
                                                                                        <span>|</span>
                                                                                        <a style="color :  #1c7ff2; text-decoration :  none; " target="_blank" href="https://link.morningbrew.com/click/25772567.1761477/aHR0cHM6Ly93d3cubW9ybmluZ2JyZXcuY29tL2RhaWx5Lz91dG1fc291cmNlPWhlYWRlcl9zaWdudXAmdXRtX21lZGl1bT1uZXdzbGV0dGVyJnV0bV9jYW1wYWlnbj1tYiZraWQ9NjdhZjRmOTEmbWlkPTY0NjRkYjg1N2JiZjEzNmIwMjIyM2FhYTkxOWJmMjFi/604a33d1c475c71b34019114B5e339e2d">Sign Up</a>
                                                                                        <span>|</span>
                                                                                        <a style="color :  #1c7ff2; text-decoration :  none; " target="_blank" href="https://link.morningbrew.com/click/25772567.1761477/aHR0cHM6Ly9zaG9wLm1vcm5pbmdicmV3LmNvbT91dG1fc291cmNlPWhlYWRlcl9zaWdudXAmdXRtX21lZGl1bT1uZXdzbGV0dGVyJnV0bV9jYW1wYWlnbj1tYiZraWQ9NjdhZjRmOTEmbWlkPTY0NjRkYjg1N2JiZjEzNmIwMjIyM2FhYTkxOWJmMjFi/604a33d1c475c71b34019114Ba16ba74d">Shop</a>
                                                                                    </td>
                                                                                </tr>
                                                                            </tbody>
                                                                        </table>
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="x_1950205409thumbnail-image" style="border-collapse :  collapse; font-size :  0px; padding :  10px 25px 25px 25px; ">
                                                                        <img style="border :  0; height :  auto; line-height :  100%; outline :  none; text-decoration :  none; width :  100%; " width="670" alt="Illustration showing on a Thanksgiving table with surrealist elements " id="1637498783205120001_imgsrc_url_4" src="https://cdn.sanity.io/images/bl383u0v/production/52e444be68ca042f383e2e2f4630d94e53db56f3-6000x6000.jpg?w=670&amp;q=70&amp;auto=format">
                                                                        <p style="display :  block; margin :  13px 0; line-height :  22px; font-family :  Arial,  Helvetica,  sans-serif; font-size :  12px; margin :  5px 13px 0 0; ">
                                                                            <em>Lydia Ortiz</em>
                                                                        </p>
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td class="x_1950205409column" style="border-collapse :  collapse; padding :  25px; ">
                                                                        <table style="border-collapse :  collapse; width :  100%; ">
                                                                            <tbody style="font-size :  14px; color :  #353535; text-align :  center; border-collapse :  collapse; ">
                                                                                <tr class="x_1950205409in_this_issue">
                                                                                    <td style="border-collapse :  collapse; font-weight :  700; background :  #fce303; border :  2px solid #353535; margin :  0px; padding :  10px; ">
                                                                                        <p style="display :  block; margin :  13px 0; line-height :  22px; padding :  0px; margin :  0px; font-size :  14px; line-height :  18px; font-family :  Georgia,  'Times New Roman',  Times,  serif; ">
                                                                                            IN THIS ISSUE
                                                                                        </p>
                                                                                    </td>
                                                                                    <td style="border-collapse :  collapse; font-family :  Arial,  Helvetica,  sans-serif; border :  2px solid #353535; margin :  0px; padding :  10px; ">
                                                                                        <p style="display :  block; margin :  13px 0; line-height :  22px; padding :  0px; margin :  0px; font-size :  14px; line-height :  18px; ">
                                                                                            <em>The business of hip hop</em>
                                                                                        </p>
                                                                                    </td>
                                                                                    <td style="border-collapse :  collapse; font-family :  Arial,  Helvetica,  sans-serif; border :  2px solid #353535; margin :  0px; padding :  10px; ">
                                                                                        <p style="display :  block; margin :  13px 0; line-height :  22px; padding :  0px; margin :  0px; font-size :  14px; line-height :  18px; ">
                                                                                            <em>Readers share words of wisdom</em>
                                                                                        </p>
                                                                                    </td>
                                                                                    <td style="border-collapse :  collapse; font-family :  Arial,  Helvetica,  sans-serif; border :  2px solid #353535; margin :  0px; padding :  10px; ">
                                                                                        <p style="display :  block; margin :  13px 0; line-height :  22px; padding :  0px; margin :  0px; font-size :  14px; line-height :  18px; ">
                                                                                            <em>The crypto/sports love affair</em>
                                                                                        </p>
                                                                                    </td>
                                                                                </tr>
                                                                            </tbody>
                                                                        </table>
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td align="center" class="x_1950205409column" style="border-collapse :  collapse; font-size :  0px; padding :  25px; ">
                                                                        <table border="0" cellpadding="0" cellspacing="0" style="border-collapse :  collapse; color :  #000000; font-family :  Arial,  Helvetica,  sans-serif; font-size :  13px; line-height :  22px; width :  100%; " width="100%">

                                                                            <tbody>
                                                                                <tr>
                                                                                    <td align="left" style="border-collapse :  collapse; font-size :  0px; " valign="bottom">
                                                                                        <table border="0" cellpadding="0" cellspacing="0" style="border-collapse :  collapse; color :  #000000; font-size :  0px; table-layout :  auto; width :  100%; border-collapse :  separate; " width="100%">
                                                                                            <tbody>
                                                                                                <tr>
                                                                                                    <td align="right" style="border-collapse :  collapse; vertical-align :  bottom; " valign="bottom" width="33%">
                                                                                                        <table border="0" cellpadding="0" cellspacing="0" style="border-collapse :  collapse; border-collapse :  separate; " width="100%">
                                                                                                            <tbody>
                                                                                                                <tr>
                                                                                                                    <td height="28" style="border-collapse :  collapse; font-size :  0; ">
                                                                                                                        &nbsp;
                                                                                                                    </td>
                                                                                                                </tr>
                                                                                                                <tr>
                                                                                                                    <td height="28" style="border-collapse :  collapse; border-top :  2px solid #353535; border-left :  2px solid #353535; border-radius :  10px 0 0 0; font-size :  0; " valign="bottom">
                                                                                                                        &nbsp;
                                                                                                                    </td>
                                                                                                                </tr>
                                                                                                            </tbody>
                                                                                                        </table>
                                                                                                    </td>
                                                                                                    <td align="center" height="40" style="border-collapse :  collapse; border :  2px solid #353535; margin :  0px; padding :  10px; " width="33%">
                                                                                                        <p style="display :  block; margin :  13px 0; line-height :  22px; text-align :  center; text-transform :  uppercase; font-family :  Georgia,  'Times New Roman',  Times,  serif; font-weight :  700; font-size :  16px; line-height :  18px; color :  #353535; padding :  0px; margin :  0px; ">
                                                                                                            Editor's Note
                                                                                                        </p>
                                                                                                    </td>
                                                                                                    <td style="border-collapse :  collapse; vertical-align :  bottom; " valign="bottom" width="33%">
                                                                                                        <table border="0" cellpadding="0" cellspacing="0" style="border-collapse :  collapse; border-collapse :  separate; " width="100%">
                                                                                                            <tbody>
                                                                                                                <tr>
                                                                                                                    <td height="28" style="border-collapse :  collapse; font-size :  0px; ">
                                                                                                                        &nbsp;
                                                                                                                    </td>
                                                                                                                </tr>
                                                                                                                <tr>
                                                                                                                    <td height="28" style="border-collapse :  collapse; border-top :  2px solid #353535; border-right :  2px solid #353535; border-radius :  0 10px 0 0; font-size :  0px; " valign="bottom">
                                                                                                                        &nbsp;
                                                                                                                    </td>
                                                                                                                </tr>
                                                                                                            </tbody>
                                                                                                        </table>
                                                                                                    </td>
                                                                                                </tr>
                                                                                            </tbody>
                                                                                        </table>
                                                                                    </td>
                                                                                </tr>

                                                                                <tr>
                                                                                    <td style="border-collapse :  collapse; vertical-align :  top; " valign="top">
                                                                                        <table border="0" cellpadding="0" cellspacing="0" style="border-collapse :  collapse; border-collapse :  separate; " width="100%">
                                                                                            <tbody>
                                                                                                <tr>
                                                                                                    <td class="x_1950205409editors_note" style="border-collapse :  collapse; padding :  0px 40px 16px 40px; border-left :  2px solid #353535; border-right :  2px solid #353535; border-bottom :  2px solid #353535; border-collapse :  collapse; border-radius :  0px 0px 10px 10px; ">
                                                                                                        <div style="font-size :  16px; font-family :  Arial,  Helvetica,  sans-serif; line-height :  16px; text-align :  left; color :  #353535; ">
                                                                                                            <div>
                                                                                                                <p style="display :  block; margin :  13px 0; line-height :  22px; "><strong>Good morning. </strong>With Thanksgiving approaching, I just wanted to say a quick thank you to all of our readers. Thanks for carving out some time to open the Brew every day, for writing in with your feedback, for laughing at our dad jokes, for sharing it with your friends, for correcting our flubs (yeah, you’re especially good at that), for rocking our swag—all of it. We’re the luckiest dang newsletter writers in the world.</p>
                                                                                                                <p style="display :  block; margin :  13px 0; line-height :  22px; font-family :  flood-std,  Arial,  Helvetica,  sans-serif; font-size :  16px; font-weight :  500; ">—Neal Freyman</p>
                                                                                                            </div>
                                                                                                        </div>
                                                                                                    </td>
                                                                                                </tr>
                                                                                            </tbody>
                                                                                        </table>
                                                                                    </td>
                                                                                </tr>
                                                                            </tbody>
                                                                        </table>
                                                                    </td>
                                                                </tr>

                                                                <tr class="">
                                                                    <td align="left" style="border-collapse :  collapse; font-size :  0px; padding :  10px 0px; ">
                                                                        <table border="0" cellpadding="0" cellspacing="0" style="border-collapse :  collapse; color :  #353535; font-family :  Arial,  sans-serif; font-size :  13px; line-height :  22px; table-layout :  auto; width :  100%; border :  none; " width="100%">
                                                                            <tbody>
                                                                                <tr>
                                                                                    <td width="33%" style="border-collapse :  collapse; ">
                                                                                        <div style="text-align :  center; background :  linear-gradient(90deg, #ffe62e 25%, #0f9046); background-color :  #1c7ff2; line-height :  4px; font-size :  4px; width :  100%; margin :  20px 0; ">
                                                                                            &nbsp;
                                                                                        </div>
                                                                                    </td>
                                                                                    <!--divtoreplacetrimmedcontent-->
                                                                                </tr>
                                                                            </tbody>
                                                                        </table>
                                                                    </td>
                                                                </tr>
                                                            </tbody>
                                                        </table>
                                                    </div>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </blockquote>
                    <div id="three_dots_overflow_showtrimmed" contenteditable="false" onclick="showTrimmedContent()">...</div>
                </div>
            </div>
        </body>

        </html>

    """.trimIndent()
}