# Patika.dev
Patika.dev Profil : https://app.patika.dev/cans06

# Ödev - 1-100 Arasındaki Asal Sayıları Bulan Program
1-100'arasında ki tüm asal sayıları ekrana yazdıran program.
### Asal Sayılar Nedir ?
Asal sayılar sadece kendilerine ve 1'e bölünen iki pozitif tam sayı böleni olan sayılardır.
## Programın Çalışması:
- İç içe iki for döngüsü kullanılır.(1.döngü 1-100 arası sayıları ifade ederken,2.döngü 1-sayi arasında ki bölen konumdadır)
- 1.Döngü 2'den başlar ve 100'e kadar döner.
    Döngü'nün 2'den başlamasının sebebi 1'in asal sayı olmamasıdır.(1 kendisine ve 1'e bölünsede iki pozitif tam sayı böleni yoktur)
- Döngü'de her seferinde isPrime değişkeni true değerini alır.
- 2.döngü 2'den başlar ve sayının bir eksiği kadar döner.(k < i )
    Burada yine sayacın 2'den başlama sebebi tüm  sayıların 1'e bölüneceğinden ötürü gereksiz işlemi engellemektir.
- 2.Döngü içerisinde bir if koşulu oluşturulur. Sayı k'nın tüm değerlerine tam bölünüyorsa isPrime değişkeni false değerini alır ve döngüden çıkılır.
- isPrime Değişkenin true olduğu durumlarda sayı ekrana yazdırılır.

