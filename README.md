# Einarbeitung

## Java

📥 https://adoptium.net

📥 https://www.eclipse.org/downloads/packages

## git

📥 https://git-scm.com/downloads

📺 [Git und GitHub Tutorial](https://www.youtube.com/watch?v=9IINVQ5wx0c)

## Web

📺 [JavaScript Tutorial](https://www.youtube.com/watch?v=9m7kD6dp5Bc)

📺 [HTML Tutorial](https://www.youtube.com/watch?v=-ogPn2b0n-E)

## Angular

📺 [TypeScript und Angular Tutorial](https://www.youtube.com/watch?v=CdvoH90fcaU)

📥 https://code.visualstudio.com/Download

📥 https://nodejs.org/en/download

```
C:\Users\fred\git> npm install -g @angular/cli

C:\Users\fred\git> ng new tour-of-heroes
? Would you like to add Angular routing? (y/N) ⏎
? Which stylesheet format would you like to use? (Use arrow keys) ⏎

C:\Users\fred\git> cd tour-of-heroes

C:\Users\fred\git\tour-of-heroes> ng serve --open
```

📜 https://angular.io/tutorial/tour-of-heroes/toh-pt0#angular-components

⚠️ An einigen Stellen im Tutorial werdet ihr Änderungen vornehmen,
die dazu führen, dass die Anwendung temporär nicht lauffähig ist.
**Sollte eure Anwendung nach einer Änderung nicht mehr laufen**, lest erst mal weiter im Tutorial!
Wahrscheinlich seid ihr einfach gerade an einer solchen Stelle angelangt, zum Beispiel:

> **The page no longer displays** properly because you changed the hero from a string to an object.
>
> Notice that **the application stopped working** when you added `[(ngModel)]`.
>
> **That displays an error** since the `hero` property doesn't exist.

💾 Ansonsten: Habt ihr die Änderungenen in den bearbeiteten Dateien
vielleicht einfach nur vergessen zu speichern? **File / Save All**

## Maven

📺 [Apache Maven installieren Windows](https://www.youtube.com/watch?v=nURYX9jASTw)

Die Tour of Heroes endet mit einem simulierten JavaScript-Backend:
- Kapitel 6 *Getting Data from a server*
- Abschnitt *Simulate a data server*

Dieses habe ich nach Java mit Spring Boot übersetzt.
Das Java-Backend kann man über Maven starten:

```
C:\Users\fred\git\heroes-backend> mvn spring-boot:run
```

Alternativ importiert man `heroes-backend` in eine IDE und startet die `HeroApplication`-Klasse.

Um das Java-Backend vom Frontend aus anzusprechen,
muss man im Abschnitt *Heroes and HTTP* die Variable `heroesUrl` wie folgt anpassen:

```ts
private heroesUrl = 'http://localhost:8080/api/heroes';  // URL to web api
//                   ^^^^^^^^^^^^^^^^^^^^^^
```

📺 [Apache Maven Tutorial](https://www.youtube.com/watch?v=ExKq23bNABk)

## Spring Boot

📺 [Spring Boot Tutorial: Web, Datenbank, Dependency Injection](https://www.youtube.com/watch?v=92YpXWAjf8o)

Zwischendurch könnte man mal das `heroes-backend` studieren...

📺 [Dependency Inversion und Dependency Injection](https://www.youtube.com/watch?v=mIRa94u8e9g)

📺 [Dependency Injection selbst gebaut](https://www.youtube.com/watch?v=f_dM81I-s64)
