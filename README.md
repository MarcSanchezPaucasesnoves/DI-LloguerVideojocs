# Aplicació de Gestió de Lloguer de Videojocs (Java Swing)

Aquesta aplicació és un sistema d'escriptori desenvolupat en **Java Swing** utilitzant l'IDE **NetBeans** per a l'assignatura *Desenvolupament d'Interfícies (FP Grau Superior - DAM)*. Permet gestionar usuaris, videojocs i el flux complet de lloguers i devolucions amb emmagatzematge de dades local (en memòria).

## 🚀 Instruccions d'Execució

### Requisits previs
* **Java Development Kit (JDK):** Versió 11 o superior recomanada.
* **IDE:** NetBeans (o qualsevol IDE compatible amb projectes Java Ant/Maven/Gradle).

### Passos per executar l'aplicació
1. **Clonar el repositori** a la teva màquina local:
   ```bash
   git clone <URL_DE_EL_TEU_REPOSITORI>
   ```
2. **Obrir el projecte** des de NetBeans (`File > Open Project` i seleccionar la carpeta del projecte).
3. **Netejar i construir** el projecte per assegurar que es generen totes les dependències.
4. **Executar el projecte** fent clic dret sobre el projecte i seleccionant `Run` (o prement `F6`).

---

## 📊 Dades Inicials de Prova

L'aplicació es llança amb una precàrrega automàtica de dades en memòria per facilitar-ne la demostració immediata. Aquestes dades es generen mitjançant el mètode `initializeObjects()` i segueixen estrictament la següent configuració:

### 👥 Usuaris Registrats
1. **Marc Sánchez Alonso** (DNI: `00000000A` | Telèfon: `000000000`)
2. **Pau Ferrer Tous** (DNI: `11111111A` | Telèfon: `111111111`)

### 🎮 Catàleg de Videojocs i Estoc Inicial
* **Ark Survival Evolved** (Gènere: *Survival*)
  * **Switch 2:** 1 unitat disponible *(estoc inicial de 2, però actualment reduït per lloguer actiu)*.
  * **PC:** 2 unitats disponibles.
  * **PS5 / Xbox:** 0 unitats disponibles.
* **Forza Horizon 4** (Gènere: *Platformer*)
  * **PS5:** 2 unitats disponibles.
  * **Xbox:** 1 unitat disponible.
  * **PC:** 0 unitats disponibles *(estoc inicial de 1, però actualment reduït per lloguer actiu)*.
  * **Switch 2:** 0 unitats disponibles.

### 📋 Lloguers Actius (Inicialitzats automàticament)
1. **Lloguer 1:** Assignat a l'usuari **Marc Sánchez Alonso** per al joc *Ark Survival Evolved* a la plataforma **Switch 2**.
2. **Lloguer 2:** Assignat a l'usuari **Pau Ferrer Tous** per al joc *Forza Horizon 4* a la plataforma **PC**.

*Nota: Aquests lloguers ja resten automàticament una unitat del stock de la seva plataforma corresponent i es mostren a la taula principal de la interfície.*
