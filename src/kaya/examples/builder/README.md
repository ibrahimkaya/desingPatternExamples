* https://refactoring.guru/design-patterns/builder
* https://java-design-patterns.com/patterns/builder/
* Karmaşık adım adım oluşturulan nesneler için tek tek her duruma uygun bir constructor yazmak yerine Builder aracılığı ile yaratmak
* Farklı ev nesnesini yaratmak için farklı farklı constructor çağırmaları yerine bir builder oluşturmak bu builder nesnesi ile kullanmak
* Öneri "telescopic constructor" durumundan kurtulmak
* bir ürünün farklı temsillerini yaratmak için kullanılabilir

---
##### Artıları
 * Adım adım oluşturma
 * benzer temsillerini yaratmak için aynı yapım aşamaları kullanılabilir
 * single responsibility prensibine uygunluk (hem nesneyi yaratma hem "business logic" üstünde hakim olmak yerine bunları ayırmak)
##### Eksileri

 *  Toplam kod karmaşıklığı artar
 