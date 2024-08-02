# iPhone Functionalities UML Diagram

```mermaid
classDiagram
    class interfaces.IMusicPlayer {
        +play()
        +pause()
        +stop()
    }

    class interfaces.IPhone {
        +call(String number)
        +hangUp()
    }

    class interfaces.IWebBrowser {
        +browse(String url)
    }

    class models.MusicPlayer {
        -String song
        +play()
        +pause()
        +stop()
        +setSong(String song)
    }

    class interfaces.IPhone {
        -String number
        +call(String number)
        +hangUp()
    }

    class models.WebBrowser {
        -String url
        +browse(String url)
    }

    class iPhone {
        +play()
        +pause()
        +stop()
        +call(String number)
        +hangUp()
        +browse(String url)
        +setSong(String song)
    }

    interfaces.IMusicPlayer <|.. models.MusicPlayer
    interfaces.IPhone <|.. interfaces.IPhone
    interfaces.IWebBrowser <|.. models.WebBrowser
    interfaces.IMusicPlayer <|..
