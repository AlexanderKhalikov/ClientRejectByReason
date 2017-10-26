--1

--Отображает статистику по партнерам: партнер, общее количество заявок, 
--количество одобренных заявок, количество отказов, количество выданных денег.


select partner_id, COUNT(application), COUNT(money) from table
union select COUNT(application) from table
where application_status = 'APPROVE'
union select COUNT(application) from table
where application_status = 'DECLINE'
order by desc

--2

--Отображает все заявки по конкретному партнеру с указанием параметров заявки 
--и ее текущего статуса, причину отказа в кредите

select application, application_parameters, application_status, reject_reason from table
where partner_id = "блаблабла"
order by desc