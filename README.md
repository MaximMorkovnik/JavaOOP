[![Prog.kiev.ua](logo.png)](https://prog.kiev.ua)

<h3>Java OOP, Homework</h3>

[**Java START ->**](https://github.com/MaximMorkovnik/JavaSTART)

<ol>
<li><strong>Занятие 1 (ВВЕДЕНИЕ В ООП_26_)</strong>
    <ul>
        <li> 1.1<br>
            <a href="/Dz101/src/com/gmail/morkovnik/maxim">
                Описать класс «Cat» (в качестве образца можно взять домашнего питомца).
		Наделить его свойствами и методами. Создать несколько экземпляров объектов
		этого класса. Использовать эти объекты.<br>
            </a>
        </li>
        <li> 1.2<br>
            <a href="/Dz102/src/com/gmail/morkovnik/maxim">
                Описать класс «Triangle». В качестве свойств возьмите длины сторон
		треугольника. Реализуйте метод, который будет возвращать площадь этого
		треугольника. Создайте несколько объектов этого класса и протестируйте их.<br>
            </a>
        </li>
        <li> 1.3<br>
            <a href="/Dz103/src/com/gmail/morkovnik/maxim">
                Описать класс «Vector3d» (т. е., он должен описывать вектор в трехмерной,
		декартовой системе координат). В качестве свойств этого класса возьмите
		координаты вектора. Для этого класса реализовать методы сложения, скалярного и
		векторного произведения векторов. Создайте несколько объектов этого класса и
		протестируйте их.<br>
            </a>
        </li>
	<li> 1.4<br>
            <a href="/Dz104/src/com/gmail/morkovnik/maxim">
                Опишите класс Phone (одним из свойств должен быть его номер). Также опишите
		класс Network (сеть мобильного оператора). Телефон должен иметь метод
		регистрации в сети мобильного оператора. Также у телефона должен быть метод call
		(номер другого телефона), который переберет все телефоны, зарегистрированные в
		сети. Если такой номер будет найден, то осуществить вызов, если нет - вывести
		сообщение об ошибочности набранного номера.<br>
            </a>
        </li>
    </ul>
</li>
<li><strong>Занятие 2 (НАСЛЕДОВАНИЕ_77_)</strong>
    <ul>
        <li> 2.1-2.5<br>
            <a href="/Dz201-205/src/com/gmail/morkovnik/maxim">
                1. Создайте абстрактный класс Shape, в котором есть два
		абстрактных метода double getPerimetr() и double getArea().<br>
		2. Создайте класс Point, в котором есть два свойства double x
		double y.<br>
		3. Создайте классы, которые описывают, как минимум, три
		геометрические фигуры (они должны быть подклассами
		Shape). При этом они в качестве свойств должны содержать
		классы Point.<br>
		4. Создайте класс доска. Доска поделена на 4 части в каждую
		часть доски можно положить одну из фигур. У доски должны
		быть методы которые помещают и удаляют фигуру с доски.
		Также должен быть метод который выводит информацию о
		всех фигурах лежащих на доске и их суммарную площадь.<br>
		5. * Нарисуйте UML диаграмму проекта.<br>
            </a>
        </li>
    </ul>
</li>
<li><strong>Занятие 3 (ПОЛИМОРФИЗМ И РАБОТА С ИСКЛЮЧЕНИЯМИ_121_)</strong>
    <ul>
        <li> 3.1-3.4<br>
            <a href="/Dz301-304/src/com/gmail/morkovnik/maxim">
         	1) Создайте класс, описывающий человека (создайте метод,
		выводящий информацию о человеке).<br>
		2) На его основе создайте класс студент (переопределите
		метод вывода информации).<br>
		3) Создайте класс Группа, который содержит массив из 10
		объектов класса Студент. Реализуйте методы добавления,
		удаления студента и метод поиска студента по фамилии. В
		случае попытки добавления 11 студента, создайте
		собственное исключение и обработайте его. Определите
		метод toString() для группы так, что бы он выводил список
		студентов в алфавитном порядке.<br>
		4) * Нарисуйте UML диаграмму проекта.<br>
            </a>
        </li>
    </ul>
</li>
<li><strong>Занятие 4 (ИНТЕРФЕЙСЫ_220_)</strong>
    <ul>
        <li> 4.1-4.5<br>
            <a href="/Dz401-405/src/com/gmail/morkovnik/maxim">
         	1. Усовершенствуйте класс Group, добавив возможность
		интерактивного добавления объекта.<br>
		2. Реализуйте возможность сортировки списка студентов
		по фамилии.<br>
		3. Реализуйте возможность сортировки по параметру
		(Фамилия, успеваемость и т. д.).<br>
		4. Реализуйте интерфейс Военком, который вернет из группы
		массив студентов - юношей, которым больше 18 лет.<br>
		5. Протестируйте его работу.<br>
            </a>
       </li>
    </ul>
</li>
<li><strong>Занятие 5 (ПОТОКИ ВВОДА-ВЫВОДА_274_)</strong>
    <ul>
        <li> 5.1<br>
            <a href="/Dz501/src/com/gmail/morkovnik/maxim">
         	Напишите программу, которая скопирует файлы с заранее
		определенным расширением(например, только doc) из
		каталога источника в каталог приемник.<br>
            </a>
       </li>
        <li> 5.2<br>
            <a href="/Dz502/src/com/gmail/morkovnik/maxim">
         	Напишите программу, которая примет на вход два
		текстовых файла, а вернет один. Содержимым этого файла
		должны быть слова, которые одновременно есть и в первом и
		во втором файле.<br>
            </a>
       </li>
        <li> 5.3-5.4<br>
            <a href="/Dz401-405(503-504)/src/com/gmail/morkovnik/maxim">
         	3. Усовершенствуйте класс, описывающий группу студентов,
		добавив возможность сохранения группы в файл.<br>
		4. Реализовать обратный процесс. Т.е. считать данные о
		группе из файла, и на их основе создать объект типа группа.<br>
            </a>
       </li>
    </ul>
</li>
<li><strong>Занятие 6 (МНОГОПОТОЧНОЕ ПРОГРАММИРОВАНИЕ. ЧАСТЬ 1_318_)</strong>
    <ul>
        <li> 6.1<br>
            <a href="/Dz601/src/com/gmail/morkovnik/maxim">
         	Создайте сто потоков, которые будут вычислять факториал
		числа, равного номеру этого потока, и выводить результат на
		экран.<br>
            </a>
       </li>
        <li> 6.2<br>
            <a href="/Dz602/src/com/gmail/morkovnik/maxim">
         	Написать код для многопоточного подсчета суммы элементов
		массива целых чисел. Сравнить скорость подсчета с простым
		алгоритмом.<br>
            </a>
       </li>
   </ul>
</li>
<li><strong>Занятие 7 (МНОГОПОТОЧНОЕ ПРОГРАММИРОВАНИЕ. ЧАСТЬ 2_380_)</strong>
    <ul>
        <li> 7.1<br>
            <a href="/Dz701/src/com/gmail/morkovnik/maxim">
         	Существуют три корабля. На каждом из них 10 ящиков груза.
		Они одновременно прибыли в порт, в котором только два
		дока. Скорость разгрузки - 1 ящик в 0.5 сек. Напишите
		программу, которая, управляя кораблями, позволит им
		правильно разгрузить груз.<br>
            </a>
       </li>
        <li> 7.2<br>
            <a href="/Dz702/src/com/gmail/morkovnik/maxim">
         	Реализуйте программу многопоточного копирования файла
		блоками с выводом прогресса на экран.<br>
            </a>
       </li>
   </ul>
 </li>
<li><strong>Занятие 8 (JAVA.LANG.OBJECT_447_)</strong>
    <ul>
        <li> 8.1<br>
            <a href="/Dz801/src/com/gmail/morkovnik/maxim">
         	Используя стандартный методы сериализации создайте мини-базу
		данных для работы с группами студентов (возможность записи и чтения
		базы из файла по запросу пользователя).<br>
            </a>
       </li>
        <li> 8.2-8.3<br>
            <a href="/Dz802-803/src/com/gmail/morkovnik/maxim">
         	2) Создайте класс-контейнер типа стек (класс в который можно добавлять и удалять объекты других классов, только в вершину стека), в который
		можно сохранять объекты произвольного типа. Должен быть метод добавления элемента в стек, получение с удалением элемента из стека, и
		просто получение элемента из вершины из стека. Должна быть реализована работа с «черным списком» классов (смотри ниже). Если
		объект который добавляется в стек принадлежит классу из «черного списка», то добавление такого объекта запрещено.<br>
		3) Для описанного выше стека создайте класс «Черный список», в котором будут описаны классы объектов которые нельзя добавлять в стек.
		Должна быть возможность добавления классов в черный список, проверка объекта на то, что класс, к которому он принадлежит, принадлежит или не
		принадлежит к классам в черном списке.<br>
            </a>
       </li>
   </ul>
 </li>
<li><strong>Занятие 9 (GENERICS AND COLLECTION_536_)</strong>
    <ul>
        <li> 9.1<br>
            <a href="/Dz901/src/com/gmail/morkovnik/maxim/Main.java">
         	Написать метод, который создаст список, положит в него 10
		элементов, затем удалит первые два и последний, а затем выведет результат на экран.<br>
            </a>
       </li>
   </ul>
 </li>
</ol>

[**Java START ->**](https://github.com/MaximMorkovnik/JavaSTART)

[_**Maxim Morkovnik**_](https://www.linkedin.com/in/mmorkovnik)<br>
([maxim.morkovnik@gmail.com](mailto:maxim.morkovnik@gmail.com))
