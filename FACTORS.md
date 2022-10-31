# THE TWELVE FACTORS
In diesem Dokument sind die angewandten Faktoren beschrieben.

## [1] I. Codebase
Der Code des Microservices ist im Versionsverwaltungsprogramm unter [GitHub](https://github.com/LeonKattendick/twelve-factors) hinterlegt.

## [2] II. Dependencies
Alle externen Abhängigkeiten wurden in der **pom.xml** hinterlegt. Über Maven werden diese im Build-Prozess verpackt und im Endprodukt mitgeliefert. Zusätzlich ist in dieser Datei der Prozessablauf dazu hinterlegt.

## [3] III. Config
In der **application.properties** werden die zum Start benötigten Einstellungen hinterlegt. Hier werden die auf der Maschine definierten Umgebungsvariablen an gewissen Stellen eingesetzt. Über die Abhängigkeit **spring-dotenv** können diese Variablen explizit in einer **.env** Datei definiert werden. Dies dient hier zur Veranschaulichung und wird im Realbetrieb mit korrekten, hinterlegten Variablen gewechselt.

## [4] IV. Backing services
Die Applikation ist mit einer Datenbank verbunden. Je nach Einstellung kann dies eine H2 oder MySQL Datenbank sein. In der Applikation wird die angebundene Datenbank durch das OR-Mapping Tool Hibernate abstrahiert.

## [5] VI. Processes
Die Applikation hinterlegt zwischen Anfragen keine Daten im Speicher und nutzt die angebundene Datenbank als Single-Source-Of-Truth. Deswegen ist auch dieser Faktor erfüllt.

## [6] VII. Port binding
Standardmäßig läuft diese Spring Boot Anwendung auf dem Port 8080. Dieser kann in der **application.properties** angepasst werden.

## [7] IX. Disposability
Durch die Angabe der `server.shutdown=graceful` Anweisung in der **application.properties** wartet der Prozess auf die Fertigstellung aller eingegangener Anfragen, bevor ein Shutdown Kommando ausgeführt wird. Durch das Setzen von `spring.lifecycle.timeout-per-shutdown-phase` wird das Warten auf eine Zeit von einer Minute begrenzt. Danach wird der Prozess gewalttätig beendet. Durch die derzeitige Größe der Applikation ist ein schnelles Starten im Rahmen von rund einer Sekunde gegeben.

## [8] XI. Logs
Geloggte Nachrichten der Applikation werden einerseits in der Konsole ausgegeben, als auch im `logs/` Ordner in einer Datei hinterlegt. Dabei werden die Log-Dateien mit ihrem Zeitstempel versehen, damit auch historische Daten erhalten bleiben.