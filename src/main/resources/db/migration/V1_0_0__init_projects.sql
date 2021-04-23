CREATE TABLE IF NOT EXISTS `projects` (

    `id` bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `project_name` varchar(150),
    `ordering_party` varchar(150),
    `products_impacted` varchar(200),
    `start_date` varchar(20),
    `end_date` varchar(200),
    `status` varchar(30),

    )ENGINE=InnoDB DEFAULT CHARSET=UTF8;