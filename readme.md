`6. September 2023` `neueFische - Java Development Bootcamp`
## Theoretische Fragen
1. Finde eine Lombok-Annotation, die bislang weder in Vortrag noch Handout genannt wurde.
```
https://projectlombok.org/features/
var und val für Variablen und Konstanten in Kurzschreibweise
```
2. Welche Vorteile ergeben sich aus der Verwendung von Lombok-Annotationen im Vergleich zur manuellen Code-Erstellung?
```
Weniger Code. Besser Lesbar. Weniger repetitive Arbeit
```
3. Nenne einen Nachteil von Lombok.
```
Man sieht nicht was man schreibt
```
## Aufgaben
1. Schritt 1: Fügt die Lombok-Abhängigkeit zu eurem Projekt hinzu und konfiguriert IntelliJ, um Lombok zu unterstützen.
2. Schritt 2: Erstellt eine einfache Klasse "Student" mit den folgenden Attributen: id, name, adress, grade.
3. Schritt 2.5: Verwendet die passenden Lombok-Annotationen, um Getter, Setter, Equals, HashCode, ToString und Konstruktoren für die Entität zu generieren.
4. Schritt 3: Erstelle einen Teacher Record mit den folgenden Attributen: id, name, subject.
5. Schritt 4: Erstelle eine Klasse Course mit den folgenden Attributen: id, name, teacher, students.
6. Schritt 4.5: Verwendet die passenden Lombok-Annotationen, um Getter, Setter, Equals, HashCode, ToString und Konstruktoren für die Entität zu generieren.
7. Schritt 5: Schreibt eine "Main"-Klasse, in der ihr einige Beispiele für das Erstellen von Students, Teachers und Courses mit den Konstruktoren anwendet.
8. Schritt 6: Prüft in der "Main"-Klasse ob die generierten Lombok Methoden korrekt funktionieren(getter, setter, toString,...).
### Lombok @Builder & @With
9. Schritt 1: Fügt zu allen Entitäten das Builder Pattern hinzu und erstellt in der main-Methode mit dem Builder weitere Objekte.
10. Schritt 2: Nutzt die With-Annotation um das ändern von Eigenschaften zu erleichtern.




