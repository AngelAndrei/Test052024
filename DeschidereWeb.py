import sys
import webbrowser


urls ={
"default": ["https:www.google.com","https:web.whatsapp.com","https://mail.yahoo.com/d/folders/1","https://open.spotify.com/"]

}

def open_webpages(urls):
    for url in urls:
        webbrowser.open_new_tab(url)

open_webpages(urls["default"])
