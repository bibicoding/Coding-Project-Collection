-- Keep a log of any SQL queries you execute as you solve the mystery.

-- Tables Concerned:
-- airports              crime_scene_reports   people
-- atm_transactions      flights               phone_calls
-- bakery_security_logs  interviews
-- bank_accounts         passengers


-- Crime Scene Report on 2023/07/28

-- Theft of the CS50 duck took place at 10:15am at the Humphrey Street bakery.
-- Interviews were conducted today with three witnesses who were present at the time – each of their interview transcripts mentions the bakery.
-- Littering took place at 16:36. No known witnesses.


-- Interview Transcript
-- Ruth: Thief get in car in bakery parking lot and drive away within 10 minutes of theft; look at security footage from parking lot
-- Eugene: Thief went to ATM the same morning on Leggett Street to withdraw money, Eugene recognize the theft
-- Raymond: Thief called someone when leaving for less than 1 min. Planned to take the earliest flight tmr. Asked the person on the phone to purchase the ticket, the person might be the assistance.

-- ATM transcript
--+----------------+--------+
--| account_number | amount |
--+----------------+--------+
--| 28500762       | 48     |
--| 28296815       | 20     |
--| 76054385       | 60     |
--| 49610011       | 50     |
--| 16153065       | 80     |
--| 25506511       | 20     |
--| 81061156       | 30     |
--| 26013199       | 35     |
--+----------------+--------+


-- Phone Call (Time + duration < 60)
--+----------------+----------------+
--|     caller     |    receiver    |
--+----------------+----------------+
--| (130) 555-0289 | (996) 555-8899 |
--| (499) 555-9472 | (892) 555-8872 |
--| (367) 555-5533 | (375) 555-8161 |
--| (499) 555-9472 | (717) 555-1342 |
--| (286) 555-6063 | (676) 555-6554 |
--| (770) 555-1861 | (725) 555-3243 |
--| (031) 555-6622 | (910) 555-3251 |
--| (826) 555-1652 | (066) 555-9701 |
--| (338) 555-6650 | (704) 555-2131 |
--+----------------+----------------+


-- Car leaving the parking lot at suspicious time (Time 15 < min < 25 + activity = exit)
--+---------------+
--| license_plate |
--+---------------+
--| 5P2BI95       |
--| 94KL13X       |
--| 6P58WS2       |
--| 4328GD8       |
--| G412CB7       |
--| L93JTIZ       |
--| 322W7JE       |
--| 0NTHK55       |
--| NAW9653       |
--| 94MV71O       |
--| V47T75I       |
--| R3G7486       |
--+---------------+


-- Flights possibly booked by theft's assistant
--+----+-------------------+------------------------+------+--------+
--| id | origin_airport_id | destination_airport_id | hour | minute |
--+----+-------------------+------------------------+------+--------+
--| 36 | 8                 | 4                      | 8    | 20     |
--| 43 | 8                 | 1                      | 9    | 30     |
--| 23 | 8                 | 11                     | 12   | 15     |
--| 53 | 8                 | 9                      | 15   | 20     |
--| 18 | 8                 | 6                      | 16   | 0      |
--+----+-------------------+------------------------+------+--------+



-- Theft suspects => phone_caller + license_plate
--+--------+-----------------+
--|  name  | passport_number |
--+--------+-----------------+
--| Sofia  | 1695452385      |
--| Diana  | 3592750733      |
--| Kelsey | 8294398571      |
--| Bruce  | 5773159633      |
--+--------+-----------------+

-- Theft suspects => phone_caller + lincense_plate + bank_account
--+-------+
--| name  |
--+-------+
--| Diana |
--| Bruce |
--+-------+

-- Theft Suspect => phone_caller + license_plate + bank_account + passport_number + earlist flight

--SELECT name FROM people
   -- WHERE name IN (SELECT name FROM people WHERE phone_number IN (SELECT caller FROM phone_calls WHERE year = 2023 AND month = 7 AND day = 28 AND duration < 60)
   -- AND license_plate IN (SELECT license_plate FROM bakery_security_logs WHERE year = 2023 AND month = 7 AND day = 28 AND minute > 15 AND minute < 25 AND activity = 'exit'))
   -- AND id IN (SELECT person_id FROM bank_accounts
   -- WHERE account_number IN (SELECT account_number FROM atm_transactions WHERE year = 2023 AND month = 7 AND day = 28
   -- AND atm_location = 'Leggett Street' AND transaction_type = 'withdraw'))
   -- AND passport_number IN (SELECT passport_number FROM passengers
   -- WHERE flight_id = 36);

--+-------+
--| name  |
--+-------+
--| Bruce |
--+-------+


-- The Theft Escaped to New York City via Flight 36

-- Assitant: Robin

--SELECT name
   -- FROM people
   -- WHERE phone_number = (SELECT receiver FROM phone_calls
   -- WHERE year = 2023 AND month = 7 AND day = 28 AND duration < 60
   -- AND caller = (SELECT phone_number FROM people WHERE name = 'Bruce'));

