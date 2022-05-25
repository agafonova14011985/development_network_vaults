# development_network_vaults

/*
Разработка сетевого хранилища на Java

 1.	Как организовать клиент-серверное взаимодействие?
Организация клиент-серверного взаимодействия происходит на уровне транспортных протоколов  (TCP/IP), протокол
управления передачи (ТСР) является сетевым протоколом более высокого уровня, обеспечивающим связывание, сортировку и
повторную передачу пакетов, чтобы обеспечить надежную доставку данных.
На программном уровне используются сокетные библиотеки (Netty/java.nio).
Через сокетные соединения пересылаются сериализованные объекты. Весь обмен данными и командами между одним
клиентом и сервером идет через  сокетное соединение. На стороне сервера и клиента данное соединение может быть
использованная многопоточность.
Необходимо разработать протокол клиент-серверного взаимодействия!

2.	Как и в каком виде передавать файлы?
3.	Как пересылать большие файлы?
4.	Как пересылать служебные команды?
    Применение пакета java.io, позволит передавать файлы.
    Данные файлов передаются через то же сокетное
    соединение, что и команды, будучи упакованы в POJO-объекты.
    
5.	Что хранить в базе данных?
Используем для работы СУБД  MySQL или mongodb, для хранения
информации о пользователях, и их данных.

6.	Как передавать структуру каталогов/файлов?
    Класс File пакета java.io используем для управления информацией о файлах и каталогах.
    
7.	Какую библиотеку использовать для сетевого взаимодействия: java.io, java.nio, Netty?
пока еще не знаю скорее всего это будет Netty

*/
