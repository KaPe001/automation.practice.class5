Stwórz program o nazwie MovieLibrary. Powinien on przechowywać listę filmów.

Każdy film powinien mieć: nazwę, tytuł, rok wydania, reżysera, gatunek oraz listę aktorów

Reżyser oraz aktorzy powinni mieć oddzielnie imię i nazwisko.

Zastosuj tutaj programowanie obiektowe – stwórz klasy np. MovieLibrary, Movie, Director, Actor (lub inne jakie uważasz) wraz z potrzebnymi polami klasy i metodami.

Tym razem nie będziesz danych wprowadzać za pomocą klawiatury ale powinny być zaimportowanee z pliku JSON

Dowiedz się jak czym są pliki JSON oraz na czym polega ich deserializacja.  Teraz możesz wybrać jedną z dwóch opcji (1 trudniejsza, 2 łatwiejsza)

1. Możesz samodzielnie zaprojektować plik JSON przechowujący dane o liście filmów zgodnie z wcześniej opisanymi wymaganiami

2. Możesz uprościć sobie całość i skorzystać z przykładowego pliku JSON, który wrzucę do zakładki ‘Pliki’ o nazwie movies.json. Będzie w nim lista 2 filmów. Jedyne co musisz zrobić to dopisać kilka dodatkowych.

 

W celu deserializacji danych skorzystaj z biblioteki ‘jackson’ (chyba, że korzystałeś kiedyś z innej i ją preferujesz)

Deserializację łopatologicznie można to określić jako zamienienie pliku JSON na listę obiektów klasy ‘Movie’. Dzięki temu będziesz miał zaimportowaną listę filmów z pliku.

Tutaj zostawiam link do tego jak użyć tej biblioteki w celu deserializacji https://www.baeldung.com/jackson-deserialization

Stwórz menu w programie, które będzie wyświetlane użytkownikowi w konsoli, wraz z obsługą wybranych przez niego opcji:

               1. Podaj dwie daty aby wyświetlić nazwy filmów wydanych pomiędzy tymi datami

               2. Wyświetl wszystkie informacje o losowym filmie

               3. Podaj imię i nazwisko aktora aby wyświetlić nazwy filmów w jakich zagrał

P.S. tym razem nie baw się już w żadną obsługę wyjątków (typu InputMismatchException) przy wybieraniu menu. Zakładamy, że użytkownik podaje dane nie popełniając błędów.
