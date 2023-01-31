create table if not EXISTS `SSI` (
    `SSICode` varchar(30) not null,
    `payBankCode` varchar(30) not null,
    `recBankCode` varchar(30) not null,
    `payAcctNo` varchar(50) not null,
    `recAcctNo` varchar(50) not null,
    `supportInfo` varchar(100) DEFAULT null,
    PRIMARY KEY (`SSICode`)
);

create table if not EXISTS `MarketSettlementMsg`(
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `tradeId` varchar(30) not null,
    `amount` bigint not null,
    `valueDate` date not null,
    `currency` varchar(10) not null,
    `SSICode` varchar(30) not null,
    PRIMARY KEY (`id`)
);