### DOKUMENT�CI� - *Madagaszk�r Pingvinjei*

#

#

### *Technol�gia 1*
# Build keretrendszer �s CI be�zemel�se
## C�lkit�z�s:
*GitHub Actions �s Gradle be�zemel�se.*

## Le�r�s
#### Gradle
A Gradle-lel a szoftverfejleszt�st bizonyos szinten automatiz�lni tudjuk, ezzel gyors�tva �s biztosabb� t�ve k�dunkat.

#### GitHub Actions
GitHub Actions haszn�lat�val tudtuk automatiz�lni folyamatos integr�ci�t, a munkafolyamatok l�trehoz�s�t k�zvetlen�l a repository-n bel�l annak min�s�g�nek n�vel�s�re.

## Munkafolyamat
Els� m�rf�ldk�k�nt a Gradle be�zemel�se mellett d�nt�tt�nk, amit siker�lt gyorsan implement�lnunk.

A 'build.gradle' file-ban defini�ltuk a f�gg�s�gek, plug-in-ek �s konfigur�ci�k list�j�t, amikkel a projekt m�k�d�s�t, saj�toss�gait �rjuk k�r�l.

A 'gradlew' file szint�n k�l�n kiemel�st �rdemel. Ez a Gradle Wrapper v�grehajthat� file-ja, amivel tudjuk futtatni a Gradle-t an�lk�l hogy telep�teni k�ne ak�rmelyik�nk g�p�re, ezzel gyors�tva a feladatok megold�s�t.

A Gradle tesztel�s egyik kimenet�t megtekinthetj�k az al�bbi �br�n.

![gradle teszt p�lda](res/gr_1.png)

A Gradle megfelel� haszn�lat�hoz *@E1LX0J* k�sz�tett egy �tmutat�t, amivel el lehetett ind�tani az alkalmaz�st a Gradle seg�ts�g�vel.
Ennek legfontosabb r�szlete volt a megfelel� JDK verzi� (*17*) be�ll�t�sa a k�rnyezeti v�ltoz�kon bel�l, �gy m�r a rendszer felismerte a JDK-t �s automatikusan haszn�hatta az alkalamz�s futtat�s�ra.

Ennek a folyamatnak a k�pekkel ell�tott dokument�ci�ja megtal�lhat� a repository-n bel�l.

A csapat tagjainak review-jai ut�n implement�lva is lett a Gradle a projekt�nkbe, �gy m�r ak�rmelyik�nk clone-ozhatott a f� branch-b�l �s a sz�m�ra kiosztott tesztel�si �s integr�ci�s feladatokat k�nyelmesen megoldhatta a Gradle seg�ts�g�vel �sszetett konfigur�ci�k �s telep�t�s n�lk�l.

A m�sodik l�p�s a CI (*CI = Continuous Integration*) be�zemel�se volt. Itt egyszer�en csak hozz�adtuk a GitHub Actions-h�z a "*Java CI with Gradle*"-t, amivel egyszer�en automatiz�lhattuk a k�d tesztel�s�t, �p�t�s�t �s telep�t�s�t is.

Itt tal�n a legfontosabb eml�t�sre m�lt� file a '*Workflow*' file, ami mag�t a CI-t kezeli. Itt defini�ltuk az integr�ci� v�grehajtand� feladatait, esem�nyeit.

Ez a file a k�vetkez� fejezetekben is kit�ntetett fontoss�gal szerepel, mivel a tov�bbi CI/CD szint emel�s �rdek�ben haszn�lt szoftvereknek a m�k�d�s�t is itt defini�lhatjuk

Ezekkel a l�p�sekkel felh�ztunk az alkalmaz�s tesztel�s�re, kezel�s�re egy k�z�s v�zt, amit b�rki b�rmikor egyszer�en el�rhet.
