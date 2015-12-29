package fr.xephi.authme.security.crypts;

/**
 * Test for {@link PHPFUSION}.
 */
public class PHPFUSIONTest extends AbstractEncryptionMethodTest {

    public PHPFUSIONTest() {
        super(new PHPFUSION(),
            new HashResult("f7a606c4eb3fcfbc382906476e05b06f21234a77d1a4eacc0f93f503deb69e70", "6cd1c97c55cb"),  // password
            new HashResult("8a9b7bb706a3347e5f684a7cb905bfb26b9a0d099358064139ab3ed1a66aeb2b", "d6012370b73f"),  // PassWord1
            new HashResult("43f2f23f44c8f89e2dbf06050bc8c77dbcdf71a7b5d28c87ec657d474e63d62d", "f75400a209a4"),  // &^%te$t?Pw@_
            new HashResult("4e7f4eb7e3653d7460f1cf590def4153c6fcdf8b8e16fb95538fdf9e54a95245", "d552e0f5b23a")); // âË_3(íù*
    }

}
