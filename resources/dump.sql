CREATE TABLE EMPLOYEE (
	ID SERIAL PRIMARY KEY,
	NAME TEXT NOT NULL,
	SURNAME TEXT NOT NULL,
	PHONE_NUMBER TEXT,
	POSITION TEXT NOT NULL,
	SALARY real,
	DTYPE TEXT
);

CREATE TABLE DISH (
	ID SERIAL PRIMARY KEY,
	NAME TEXT NOT NULL,
	CATEGORY TEXT NOT NULL,
	PRICE real,
	WEIGHT real
);

CREATE TABLE ORDERS (
	ID SERIAL PRIMARY KEY,
	EMPLOYEE_ID int NOT NULL,
	TABLE_NUMBER TEXT NOT NULL,
	ORDER_DATE TIMESTAMP
);
ALTER TABLE ORDERS ADD CONSTRAINT EMPLOYEE_ID_FK
FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE (ID);

CREATE TABLE DISH_TO_ORDER (
  DISH_ID int NOT NULL,
  ORDER_ID int NOT NULL
);
ALTER TABLE DISH_TO_ORDER ADD CONSTRAINT DISH_ID_FK
FOREIGN KEY (DISH_ID) REFERENCES DISH (ID);
ALTER TABLE DISH_TO_ORDER ADD CONSTRAINT ORDER_ID_FK
FOREIGN KEY (ORDER_ID) REFERENCES ORDERS (ID);
