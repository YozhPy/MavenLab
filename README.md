# MavenLab
# This is my SoftwareDevLab with Maven usage
## Завдання		
### Розробіть систему відповідно до вашої теми, в якій будуть реалізовувані:	

- різні модифікатори доступу (public, private,..) класів/методів/полів (1 бал) - усі класи	
		
- присутня інкапсуляція (1 бал) - усі класи, крім main
		
- присутнє наслідування (1 бал) - DiningSet, TeaSet від класу DinnerSet

- присутній інтерфейс і його імплементація (1 бал)	- клас Customer implements Person 
		
- присутній поліморфізм (1 бал) - декілька методів toString, а також print_set
		
- присутній абстрактний клас (1 бал) - DinnerSet
		
- використовується перераховування константних об’єктів (enum) (1 бал) - Material		

- Перевизначити метод toString() для класу enum. Додати до перерахування власний метод. (1 бал) - Material

- Зібрати строку за допомогою StringBuffer або StringBuilder. (1 бал) метод getReview класу DinnerSet

- Використати метод String.split(...) для розділення строки за критерієм обраного символу. - один із конструкторів 
класу Customer
		
- Вивести деякі строки на екран консолі із використанням конкатенції строк із іншими типами (1 бал). - Main

- Створити клас-виключення для обробки специфічної для вашої тематики помилки. (1 бал) - клас AmountItemsException

- Кидати створену ваму помилку та інші за необхідності у ході виконання програми, обробляти їх у влучному місці за 
допомогою блоку try-catch - у класі TeaSet для всіх кількостей. Не робив цього у класі DiningSet, бо буде дуже
важко читати код при перевірці

- Використати неперевизначений метод equals або hashCode для порівняння двох об’єктів одного з ваших класів. (1 бал) - 
у методі main у функції fillSetList

- Перевизначити метод equals або hashCode у одному з ваших класів, використати перевизначений метод для перевірки об’єктів цього класу. (1 бал)	-	
у класі Customer
		
- наявний вкладений (nested) клас (1 бал) - Small Review
		
- присутня асоціація класів (1 бал) - у методі clientsNeedsRegistration класу SetsList.
Оскільки у методі наявний об'єкт типу Customer, то між класами Customer і SetsList існує пряма ассоціація

- присутня композиція або агрегація (без урахування nested класу) (1 бал) - поле Customer у DinnerSet
		
- присутня колекція із java.util.Collections - LinkedHashMap - DiningSet, TeaSet; ArrayList - SetsList