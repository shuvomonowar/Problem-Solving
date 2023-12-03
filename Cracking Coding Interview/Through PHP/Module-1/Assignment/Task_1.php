<?php
namespace Module_1;

class Task_1 {
    public function Solution() {
        $input_number = readline("Enter input number : ");
        $result = 1;

        while ($input_number > 1) {
            $result *= $input_number;
            $input_number--;
        }

        printf("The result of factorial is " . (int)$result);
    }
}

$tsk_1 = new Task_1();
$tsk_1->Solution();