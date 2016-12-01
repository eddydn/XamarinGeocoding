using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Java.Net;
using Java.IO;

namespace XamarinGeocoding.Helper
{
    public class HttpDataHandler
    {
        public HttpDataHandler() { }

        public string GetHTTPData(string urlRequest)
        {
            URL url;
            string response = String.Empty;
            try
            {
                url = new URL(urlRequest);
                HttpURLConnection conn = (HttpURLConnection)url.OpenConnection();
                conn.SetRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                conn.RequestMethod = "GET";
                conn.ReadTimeout = 15000;
                conn.ConnectTimeout = 15000;
                conn.DoInput = true;
                conn.DoOutput = true;

                if (conn.ResponseCode == HttpStatus.Ok)
                {
                    string line;
                    BufferedReader br = new BufferedReader(new InputStreamReader(conn.InputStream));
                    while ((line = br.ReadLine()) != null)
                        response += line;
                }
                else
                    response = String.Empty;
            }
            catch(ProtocolException ex)
            {
                ex.PrintStackTrace();
            }
            catch(MalformedURLException ex)
            {
                ex.PrintStackTrace();
            }
            catch(IOException ex)
            {
                ex.PrintStackTrace();
            }
            return response;
        }
    }
}