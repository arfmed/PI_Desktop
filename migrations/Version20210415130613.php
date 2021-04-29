<?php

declare(strict_types=1);

namespace DoctrineMigrations;

use Doctrine\DBAL\Schema\Schema;
use Doctrine\Migrations\AbstractMigration;

/**
 * Auto-generated Migration: Please modify to your needs!
 */
final class Version20210415130613 extends AbstractMigration
{
    public function getDescription() : string
    {
        return '';
    }

    public function up(Schema $schema) : void
    {
        // this up() migration is auto-generated, please modify it to your needs
        $this->addSql('CREATE TABLE client (id INT AUTO_INCREMENT NOT NULL, nom VARCHAR(255) NOT NULL, prenom VARCHAR(255) NOT NULL, mail VARCHAR(255) NOT NULL, PRIMARY KEY(id)) DEFAULT CHARACTER SET utf8mb4 COLLATE `utf8mb4_unicode_ci` ENGINE = InnoDB');
        $this->addSql('CREATE TABLE client_reservation (client_id INT NOT NULL, reservation_id INT NOT NULL, INDEX IDX_43836C6E19EB6921 (client_id), INDEX IDX_43836C6EB83297E7 (reservation_id), PRIMARY KEY(client_id, reservation_id)) DEFAULT CHARACTER SET utf8mb4 COLLATE `utf8mb4_unicode_ci` ENGINE = InnoDB');
        $this->addSql('CREATE TABLE evenement (id INT AUTO_INCREMENT NOT NULL, lieu VARCHAR(255) NOT NULL, heure VARCHAR(255) NOT NULL, nbpart INT NOT NULL, date DATE NOT NULL, PRIMARY KEY(id)) DEFAULT CHARACTER SET utf8mb4 COLLATE `utf8mb4_unicode_ci` ENGINE = InnoDB');
        $this->addSql('CREATE TABLE evenement_reservation (evenement_id INT NOT NULL, reservation_id INT NOT NULL, INDEX IDX_D35D5F7EFD02F13 (evenement_id), INDEX IDX_D35D5F7EB83297E7 (reservation_id), PRIMARY KEY(evenement_id, reservation_id)) DEFAULT CHARACTER SET utf8mb4 COLLATE `utf8mb4_unicode_ci` ENGINE = InnoDB');
        $this->addSql('CREATE TABLE reservation (id INT AUTO_INCREMENT NOT NULL, description VARCHAR(255) NOT NULL, date DATETIME NOT NULL, PRIMARY KEY(id)) DEFAULT CHARACTER SET utf8mb4 COLLATE `utf8mb4_unicode_ci` ENGINE = InnoDB');
        $this->addSql('ALTER TABLE client_reservation ADD CONSTRAINT FK_43836C6E19EB6921 FOREIGN KEY (client_id) REFERENCES client (id) ON DELETE CASCADE');
        $this->addSql('ALTER TABLE client_reservation ADD CONSTRAINT FK_43836C6EB83297E7 FOREIGN KEY (reservation_id) REFERENCES reservation (id) ON DELETE CASCADE');
        $this->addSql('ALTER TABLE evenement_reservation ADD CONSTRAINT FK_D35D5F7EFD02F13 FOREIGN KEY (evenement_id) REFERENCES evenement (id) ON DELETE CASCADE');
        $this->addSql('ALTER TABLE evenement_reservation ADD CONSTRAINT FK_D35D5F7EB83297E7 FOREIGN KEY (reservation_id) REFERENCES reservation (id) ON DELETE CASCADE');
    }

    public function down(Schema $schema) : void
    {
        // this down() migration is auto-generated, please modify it to your needs
        $this->addSql('ALTER TABLE client_reservation DROP FOREIGN KEY FK_43836C6E19EB6921');
        $this->addSql('ALTER TABLE evenement_reservation DROP FOREIGN KEY FK_D35D5F7EFD02F13');
        $this->addSql('ALTER TABLE client_reservation DROP FOREIGN KEY FK_43836C6EB83297E7');
        $this->addSql('ALTER TABLE evenement_reservation DROP FOREIGN KEY FK_D35D5F7EB83297E7');
        $this->addSql('DROP TABLE client');
        $this->addSql('DROP TABLE client_reservation');
        $this->addSql('DROP TABLE evenement');
        $this->addSql('DROP TABLE evenement_reservation');
        $this->addSql('DROP TABLE reservation');
    }
}
