CREATE TABLE IF NOT EXISTS `tasks` (

    `id` bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `task_name` varchar(200),
    `description` varchar(500),
    `status` varchar(12)

)ENGINE=InnoDB DEFAULT CHARSET=UTF8;