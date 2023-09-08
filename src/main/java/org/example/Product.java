package org.example;

import lombok.*;

@Data // Dadurch Wegall der Getter/ Setter/ Equals/ HashCode etc für alle Felder die nicht final sind
@AllArgsConstructor
@NoArgsConstructor // was die beiden machen, weiß nur Zeshan...
@Builder // macht es komplizierter Objekte zu füllen
@With // Wenn es hier steht, sind alle variablen WITHer

public class Product {
    private String id;
    private String name;
    //With // die oberen sind erforderlich um einProdukt zu erstellen, das unter With nicht. Erstllt eine Kopie. BZW weiß auch nur Zeshan!
    private int count;
}
