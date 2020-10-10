<h2> Adapter </h2>

* uyumsuz iki farklı interface'in biri ile çalışabilmesini sağlar 

* adapter bir objeyi sararak diğer objenin anlamasına olanak sağlayacak hale getirir, bu kapsama iki objenin iç yapılarında değişiklere gitmeden olur
 <h5> ne zaman ?</h5>
 
 * eski bir sınıfını kullanmak istiyorsun ama uyumlu bir interface'e sahip değil , "mid layer" olarak bir adapter yazmak
 
 *  bir kaç alt sınıfı kullanmak istiyorsun ama üst sınıfa eklemeye imkan vermeyen ortak davranış, yeni alt sınıflar oluşturarak bu özelliği yazmak mümkün ama kod tekrarı kaçınılmaz olur ? 
    * istediğimiz sınıfları adapter ile sararken yeni özelliği ekleyebilirsin 
    
https://refactoring.guru/design-patterns/adapter
https://www.geeksforgeeks.org/adapter-pattern/